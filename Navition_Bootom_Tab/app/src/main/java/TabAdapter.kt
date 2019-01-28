package jo.edu.ju.icontabs

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class TabAdapter(fm: FragmentManager, var fragments : ArrayList<Fragment>) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
                return fragments[position]
            }

    override fun getCount(): Int {
        return fragments.size
    }

}