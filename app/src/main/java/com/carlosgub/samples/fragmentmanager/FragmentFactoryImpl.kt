package com.carlosgub.samples.fragmentmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

class FragmentFactoryImpl(): FragmentFactory() {

    private var bundle =  Bundle()

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            SampleFragment::class.java.name -> {
                SampleFragment().apply {
                    arguments = bundle
                }
            }
            else -> super.instantiate(classLoader, className)
        }
    }

    fun setBundle(bundle: Bundle){
        this.bundle = bundle
    }
}