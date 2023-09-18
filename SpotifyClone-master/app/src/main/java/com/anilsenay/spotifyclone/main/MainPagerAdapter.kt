package com.anilsenay.spotifyclone.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.anilsenay.spotifyclone.R
import com.anilsenay.spotifyclone.favorites.FavoritesFragment
import com.anilsenay.spotifyclone.radios.RadiosFragment


class MainPagerAdapter(context: Context, fragmentManager: FragmentManager, behavior: Int) : FragmentStatePagerAdapter(fragmentManager, behavior) {

    private val tabs = context.applicationContext.resources.getStringArray(R.array.tabs)

    override fun getItem(position: Int): Fragment {
        return when(position){
            TAB_INDEX_RADIOS -> RadiosFragment.newInstance()
            TAB_INDEX_FAVORITES -> FavoritesFragment.newInstance()
            else -> throw IllegalStateException("Can not find fragment. Position: $position")
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabs[position].toUpperCase()
    }

    companion object{
        private const val TAB_INDEX_RADIOS = 0
        private const val TAB_INDEX_FAVORITES = 1
    }

}