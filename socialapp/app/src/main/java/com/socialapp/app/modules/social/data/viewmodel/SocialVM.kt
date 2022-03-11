package com.socialapp.app.modules.social.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialapp.app.modules.social.`data`.model.SocialModel

public class SocialVM : ViewModel() {
  public val socialModel: MutableLiveData<SocialModel> = MutableLiveData(SocialModel())

  public var navArguments: Bundle? = null
}
