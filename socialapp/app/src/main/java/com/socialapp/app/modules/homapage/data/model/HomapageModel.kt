package com.socialapp.app.modules.homapage.`data`.model

import com.socialapp.app.R
import com.socialapp.app.appcomponents.di.MyApp
import kotlin.String

public data class HomapageModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppList: String? = MyApp.getInstance().resources.getString(R.string.lbl_app_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCb: String? = MyApp.getInstance().resources.getString(R.string.lbl_cb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDevelopedByAn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_developed_by_an)

)
