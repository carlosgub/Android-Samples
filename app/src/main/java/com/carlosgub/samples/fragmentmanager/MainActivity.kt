package com.carlosgub.samples.fragmentmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlosgub.samples.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fragmentFactoryImpl = FragmentFactoryImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory = fragmentFactoryImpl
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapterViewPager = MyPagerAdapter(supportFragmentManager)

        setTitleSampleFragment("Title 1")
        adapterViewPager.addFragment(supportFragmentManager.fragmentFactory.instantiate(classLoader, SampleFragment::class.java.name))

        setTitleSampleFragment("Title 2")
        adapterViewPager.addFragment(supportFragmentManager.fragmentFactory.instantiate(classLoader, SampleFragment::class.java.name))

        setTitleSampleFragment("Title 3")
        adapterViewPager.addFragment(supportFragmentManager.fragmentFactory.instantiate(classLoader, SampleFragment::class.java.name))

        setTitleSampleFragment("Title 4")
        adapterViewPager.addFragment(supportFragmentManager.fragmentFactory.instantiate(classLoader, SampleFragment::class.java.name))
        vpMain.adapter = adapterViewPager

        vpMain.setCurrentItem(0,true)


    }

    private fun setTitleSampleFragment(title:String){
        fragmentFactoryImpl.setBundle(Bundle().apply {
            putString(SampleFragment.ARG_TITLE,title)
        })
    }
}
