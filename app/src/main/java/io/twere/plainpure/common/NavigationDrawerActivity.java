package io.twere.plainpure.common;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.LayoutRes;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.Bind;
import butterknife.BindDimen;
import com.bumptech.glide.Glide;
import io.twere.plainpure.R;

public abstract class NavigationDrawerActivity extends HomeActivity {

  @Bind(R.id.drawerLayout) DrawerLayout drawerLayout;
  @Bind(R.id.vNavigation) NavigationView vNavigation;
  @BindDimen(R.dimen.global_menu_avatar_size) int avatarSize;

  private ImageView ivMenuUserProfilePhoto;

  @Override public void setContentView(@LayoutRes int layoutResID) {
    super.setContentViewWithoutInject(R.layout.activity_drawer);
    ViewGroup viewGroup = (ViewGroup) findViewById(R.id.flContentRoot);
    LayoutInflater.from(this).inflate(layoutResID, viewGroup, true);
    bindViews();
    setupHeader();
    setupItems();
  }

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getActivityComponent().inject(this);
  }

  @Override protected void setupToolbar() {
    super.setupToolbar();
    if (getToolbar() != null) {
      getToolbar().setNavigationOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
          drawerLayout.openDrawer(Gravity.LEFT);
        }
      });
    }
  }

  private void setupItems() {
    Menu menu = vNavigation.getMenu();

    menu.getItem(0).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
      @Override public boolean onMenuItemClick(MenuItem menuItem) {
        drawerLayout.closeDrawer(Gravity.LEFT);
        menuItem.setChecked(true);
        return false;
      }
    });

    menu.getItem(1).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
      @Override public boolean onMenuItemClick(MenuItem menuItem) {
        drawerLayout.closeDrawer(Gravity.LEFT);
        menuItem.setChecked(true);
        return false;
      }
    });

    menu.getItem(2).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
      @Override public boolean onMenuItemClick(MenuItem menuItem) {
        drawerLayout.closeDrawer(Gravity.LEFT);
        menuItem.setChecked(true);
        return false;
      }
    });
  }

  private void setupHeader() {

    View headerView = vNavigation.getHeaderView(0);
    ivMenuUserProfilePhoto = (ImageView) headerView.findViewById(R.id.iv_avatar_profile);
    headerView.findViewById(R.id.ll_header).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        onGlobalMenuHeaderClick(v);
      }
    });

    Glide.with(this)
        .load(
            "http://umdb.org.ua/images/imgs/__local10001/impsize/1243004483291.jpg")
        .placeholder(R.drawable.img_circle_placeholder)
        .override(avatarSize, avatarSize)
        .centerCrop()
        .into(ivMenuUserProfilePhoto);
  }

  public void onGlobalMenuHeaderClick(final View v) {
    drawerLayout.closeDrawer(Gravity.LEFT);
    new Handler().postDelayed(new Runnable() {
      @Override public void run() {
        int[] startingLocation = new int[2];
        v.getLocationOnScreen(startingLocation);
        startingLocation[0] += v.getWidth() / 2;

        overridePendingTransition(0, 0);
      }
    }, 200);
  }
}
