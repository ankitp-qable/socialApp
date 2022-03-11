package com.socialapp.app.modules.appnavigation.`data`.model

import com.socialapp.app.R
import com.socialapp.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHomaPage: String? = MyApp.getInstance().resources.getString(R.string.lbl_homapage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSocial: String? = MyApp.getInstance().resources.getString(R.string.lbl_social)

)
