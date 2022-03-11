package com.socialapp.app.modules.social.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.socialapp.app.R
import com.socialapp.app.appcomponents.base.BaseActivity
import com.socialapp.app.databinding.ActivitySocialBinding
import com.socialapp.app.modules.social.`data`.viewmodel.SocialVM
import kotlin.String
import kotlin.Unit

public class SocialActivity : BaseActivity<ActivitySocialBinding>(R.layout.activity_social) {
  private val viewModel: SocialVM by viewModels<SocialVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.socialVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "SOCIAL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SocialActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
