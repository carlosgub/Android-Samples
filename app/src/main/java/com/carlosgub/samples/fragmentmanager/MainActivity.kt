package com.carlosgub.samples.fragmentmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.carlosgub.samples.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fragmentFactoryImpl = FragmentFactoryImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        //Siempre se debe agregar la linea de fragment factory antes del super.onCreate
        supportFragmentManager.fragmentFactory = fragmentFactoryImpl
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ejemplo View Pager con Fragment Factory

        /*val adapterViewPager = MyPagerAdapter(supportFragmentManager)

        setTitleSampleFragment("Title 1")
        adapterViewPager.addFragment(supportFragmentManager.fragmentFactory.instantiate(classLoader, SampleFragment::class.java.name))

        setTitleSampleFragment("Title 2")
        adapterViewPager.addFragment(supportFragmentManager.fragmentFactory.instantiate(classLoader, SampleFragment::class.java.name))

        setTitleSampleFragment("Title 3")
        adapterViewPager.addFragment(supportFragmentManager.fragmentFactory.instantiate(classLoader, SampleFragment::class.java.name))

        setTitleSampleFragment("Title 4")
        adapterViewPager.addFragment(supportFragmentManager.fragmentFactory.instantiate(classLoader, SampleFragment::class.java.name))
        vpMain.adapter = adapterViewPager*/

        //Ejemplo con Fragment View Container
        setTitleSampleFragment("Title 1")
        val fragment = supportFragmentManager.fragmentFactory.instantiate(classLoader, SampleFragment::class.java.name)

        supportFragmentManager.commit {
            add(R.id.fcvMain,fragment)
        }

    }

    private fun setTitleSampleFragment(title:String){
        fragmentFactoryImpl.setBundle(Bundle().apply {
            putString(SampleFragment.ARG_TITLE,title)
        })
    }
}
