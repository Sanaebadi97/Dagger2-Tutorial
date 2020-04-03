package info.sanaebadi.dagger_tutorial.model

import javax.inject.Inject

//class River  @Inject constructor(){
//
//
//    fun getWater():String{
//        return "Water "
//    }
//}


//IT IS LOCK CLASS AND FOR VIEW

//we can not edit this class and add @SingleTon so we add that in module

class River  constructor(){

    fun getWater():String{
        return "Water "
    }
}