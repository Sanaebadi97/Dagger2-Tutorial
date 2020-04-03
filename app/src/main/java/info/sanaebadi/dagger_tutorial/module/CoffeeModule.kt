package info.sanaebadi.dagger_tutorial.module

import dagger.Module
import dagger.Provides
import info.sanaebadi.dagger_tutorial.model.River



@Module
class CoffeeModule {


    @Provides
    fun provideRiver(): River {
        return River()
    }
}