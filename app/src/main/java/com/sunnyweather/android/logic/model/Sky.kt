package com.sunnyweather.android.logic.model

import com.sunnyweather.android.R
import com.sunnyweather.android.SunnyWeatherApplication

class Sky(val info: String, val icon: Int, val bg: Int)

private val key = mapOf(
    "CLEAR_DAY" to Sky(
        SunnyWeatherApplication.context.getString(R.string.clear),
        R.drawable.ic_clear_day,
        R.drawable.bg_clear_day
    ), "CLEAR_NIGHT" to Sky(
        SunnyWeatherApplication.context.getString(R.string.clear),
        R.drawable.ic_clear_night,
        R.drawable.bg_clear_night
    ), "PARTLY_CLOUDY_DAY" to Sky(
        SunnyWeatherApplication.context.getString(R.string.partly_cloudy),
        R.drawable.ic_partly_cloud_day,
        R.drawable.bg_partly_cloudy_day
    ), "PARTLY_CLOUDY_NIGHT" to Sky(
        SunnyWeatherApplication.context.getString(R.string.partly_cloudy),
        R.drawable.ic_partly_cloud_night,
        R.drawable.bg_partly_cloudy_night
    ), "CLOUDY" to Sky(
        SunnyWeatherApplication.context.getString(R.string.cloudy),
        R.drawable.ic_cloudy,
        R.drawable.bg_cloudy
    ), "WIND" to Sky(
        SunnyWeatherApplication.context.getString(R.string.wind),
        R.drawable.ic_cloudy,
        R.drawable.bg_wind
    ), "LIGHT_RAIN" to Sky(
        SunnyWeatherApplication.context.getString(R.string.light_rain),
        R.drawable.ic_light_rain,
        R.drawable.bg_rain
    ), "MODERATE_RAIN" to Sky(
        SunnyWeatherApplication.context.getString(R.string.moderate_rain),
        R.drawable.ic_moderate_rain,
        R.drawable.bg_rain
    ), "HEAVY_RAIN" to Sky(
        SunnyWeatherApplication.context.getString(R.string.heavy_rain),
        R.drawable.ic_heavy_rain,
        R.drawable.bg_rain
    ), "STORM_RAIN" to Sky(
        SunnyWeatherApplication.context.getString(R.string.storm_rain),
        R.drawable.ic_storm_rain,
        R.drawable.bg_rain
    ), "THUNDER_SHOWER" to Sky(
        SunnyWeatherApplication.context.getString(R.string.thunder_shower),
        R.drawable.ic_thunder_shower,
        R.drawable.bg_rain
    ), "SLEET" to Sky(
        SunnyWeatherApplication.context.getString(R.string.sleet),
        R.drawable.ic_sleet,
        R.drawable.bg_rain
    ), "LIGHT_SNOW" to Sky(
        SunnyWeatherApplication.context.getString(R.string.light_snow),
        R.drawable.ic_light_snow,
        R.drawable.bg_snow
    ), "MODERATE_SNOW" to Sky(
        SunnyWeatherApplication.context.getString(R.string.moderate_snow),
        R.drawable.ic_moderate_snow,
        R.drawable.bg_snow
    ), "HEAVY_SNOW" to Sky(
        SunnyWeatherApplication.context.getString(R.string.heavy_snow),
        R.drawable.ic_heavy_snow,
        R.drawable.bg_snow
    ), "STORM_SNOW" to Sky(
        SunnyWeatherApplication.context.getString(R.string.storm_snow),
        R.drawable.ic_heavy_snow,
        R.drawable.bg_snow
    ), "HAIL" to Sky(
        SunnyWeatherApplication.context.getString(R.string.hail),
        R.drawable.ic_hail,
        R.drawable.bg_snow
    ), "LIGHT_HAZE" to Sky(
        SunnyWeatherApplication.context.getString(R.string.light_haze),
        R.drawable.ic_light_haze,
        R.drawable.bg_fog
    ), "MODERATE_HAZE" to Sky(
        SunnyWeatherApplication.context.getString(R.string.moderate_haze),
        R.drawable.ic_moderate_haze,
        R.drawable.bg_fog
    ), "HEAVY_HAZE" to Sky(
        SunnyWeatherApplication.context.getString(R.string.heavy_haze),
        R.drawable.ic_heavy_haze,
        R.drawable.bg_fog
    ), "FOG" to Sky(
        SunnyWeatherApplication.context.getString(R.string.fog),
        R.drawable.ic_fog,
        R.drawable.bg_fog
    ), "DUST" to Sky(
        SunnyWeatherApplication.context.getString(R.string.dust),
        R.drawable.ic_fog,
        R.drawable.bg_fog
    )
)

fun getSky(skycon: String): Sky {
    return key[skycon] ?: key["CLEAR_DAY"]!!
}
