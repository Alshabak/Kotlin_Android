package jo.edu.ju.icontabs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragment = ArrayList<Fragment>()
        fragment.add(FirstFragment())
        fragment.add(SecondFragment())
        fragment.add(ThirdFragment())
        fragment.add(FourthFragment())

        var fragmentPagerAdapter = TabAdapter(supportFragmentManager, fragment)
        mViewPager.adapter = fragmentPagerAdapter
        mTabLayout.setupWithViewPager(mViewPager)

        configureTabLayout()
    }

    private fun configureTabLayout() {
        mTabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_keyboard_backspace_black_24dp)
        mTabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_notifications_active_black_24dp)
        mTabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_home_black_24dp)
        mTabLayout.getTabAt(3)!!.setIcon(R.drawable.ic_phone_black_24dp)

    }
}
