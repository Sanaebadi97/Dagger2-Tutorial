package info.sanaebadi.dagger_tutorial.model

import javax.inject.Inject

class River  @Inject constructor(){


    fun getWater():String{
        return "Water "
    }
}