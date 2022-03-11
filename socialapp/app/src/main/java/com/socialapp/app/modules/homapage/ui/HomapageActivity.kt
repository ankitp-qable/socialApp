package com.socialapp.app.modules.homapage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.socialapp.app.R
import com.socialapp.app.appcomponents.base.BaseActivity
import com.socialapp.app.databinding.ActivityHomapageBinding
import com.socialapp.app.modules.homapage.`data`.viewmodel.HomapageVM
import kotlin.String
import kotlin.Unit

public class HomapageActivity : BaseActivity<ActivityHomapageBinding>(R.layout.activity_homapage) {
  private val viewModel: HomapageVM by viewModels<HomapageVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.homapageVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "HOMAPAGE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomapageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
