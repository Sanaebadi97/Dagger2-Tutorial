package info.sanaebadi.dagger_tutorial.module

import dagger.Module
import dagger.Provides
import info.sanaebadi.dagger_tutorial.model.River
import javax.inject.Singleton

//
//@Module
//class CoffeeModule constructor(val sugar:Int){
//
//
//    @Provides
//    fun provideRiver(): River {
//        return River()
//    }
//
//
//    @Provides
//    fun providerSugar(): Int {
//        return sugar
//    }
//}
@Module
class CoffeeModule constructor(){


    //we add singleTon here bcz we can not use it in River class

    @Provides @Singleton
    fun provideRiver(): River {
        return River()
    }



}