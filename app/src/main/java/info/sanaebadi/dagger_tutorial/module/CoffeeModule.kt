package info.sanaebadi.dagger_tutorial.module

import info.sanaebadi.dagger_tutorial.model.River

class CoffeeModule {


    fun provideRiver(): River {
        return River()
    }
}