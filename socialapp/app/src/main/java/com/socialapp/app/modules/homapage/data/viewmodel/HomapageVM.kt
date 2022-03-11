package com.socialapp.app.modules.homapage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialapp.app.modules.homapage.`data`.model.HomapageModel

public class HomapageVM : ViewModel() {
  public val homapageModel: MutableLiveData<HomapageModel> = MutableLiveData(HomapageModel())

  public var navArguments: Bundle? = null
}
