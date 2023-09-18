package com.anilsenay.spotifyclone.radios

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.anilsenay.spotifyclone.R
import com.anilsenay.spotifyclone.Radio
import com.anilsenay.spotifyclone.RadioServiceProvider
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RadiosFragment : Fragment(){

    private val radioServiceProvider = RadioServiceProvider()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_radios, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val popularRadiosObservable = radioServiceProvider
            .getRadioService()
            .getPopularRadios()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                Consumer {
                    Log.v("TEST", "Success : $it")

                },
                Consumer {
                    Log.v("TEST", "Failed : $it")
                })

        radioServiceProvider
            .getRadioService()
            .getLocationRadios()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                Consumer {
                    Log.v("TEST", "Success : $it")

                },
                Consumer {
                    Log.v("TEST", "Failed : $it")
                })
    }

    companion object{

        fun newInstance() = RadiosFragment()

    }
}