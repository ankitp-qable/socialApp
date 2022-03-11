package com.socialapp.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.socialapp.app.R
import com.socialapp.app.appcomponents.base.BaseActivity
import com.socialapp.app.databinding.ActivityAppNavigationBinding
import com.socialapp.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.socialapp.app.modules.homapage.ui.HomapageActivity
import com.socialapp.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearSocial.setOnClickListener {
      val destIntent = SocialActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomaPage.setOnClickListener {
      val destIntent = HomapageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
