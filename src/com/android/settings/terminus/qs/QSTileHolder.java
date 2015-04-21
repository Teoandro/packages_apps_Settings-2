/*
 * Copyright (C) 2015 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.settings.terminus.qs;

import android.content.Context;

import android.text.TextUtils;
import com.android.internal.util.cm.QSConstants;
import com.android.internal.util.cm.QSUtils;
import com.android.settings.R;

import java.util.Arrays;

/**
 * This class holds the icon, the name - or the string the user sees,
 * and the value which will be stored
 */
public class QSTileHolder {
    public static final String TILE_ADD_DELETE = "";

    public final String resourceName;
    public final String value;
    public final String name;

    public QSTileHolder(String resourceName, String value, String name) {
        this.resourceName = resourceName;
        this.value = value;
        this.name = name;
    }

    public static QSTileHolder from(Context context, String tileType) {
        String resourceName = null;
        int stringId = -1;

        if (!TILE_ADD_DELETE.equals(tileType) &&
                !QSUtils.getAvailableTiles(context).contains(tileType)) {
            return null;
        }

        switch (tileType) {
            case TILE_ADD_DELETE:
                break;
            case QSConstants.TILE_WIFI:
                resourceName = "ic_qs_wifi_full_4";
                stringId = R.string.qs_tile_wifi;
                break;
            case QSConstants.TILE_BLUETOOTH:
                resourceName = "ic_qs_bluetooth_on";
                stringId = R.string.qs_tile_bluetooth;
                break;
            case QSConstants.TILE_INVERSION:
                resourceName = "ic_qs_inversion_on";
                stringId = R.string.qs_tile_display_inversion;
                break;
            case QSConstants.TILE_CELLULAR:
                resourceName = "ic_qs_signal_full_4";
                stringId = R.string.qs_tile_cellular_data;
                break;
            case QSConstants.TILE_AIRPLANE:
                resourceName = "ic_qs_airplane_on";
                stringId = R.string.qs_tile_airplane_mode;
                break;
            case QSConstants.TILE_ROTATION:
                resourceName = "ic_qs_rotation_locked";
                stringId = R.string.qs_tile_display_rotation;
                break;
            case QSConstants.TILE_FLASHLIGHT:
                resourceName = "ic_qs_flashlight_on";
                stringId = R.string.qs_tile_flashlight;
                break;
            case QSConstants.TILE_LOCATION:
                resourceName = "ic_qs_location_on";
                stringId = R.string.qs_tile_location;
                break;
            case QSConstants.TILE_CAST:
                resourceName = "ic_qs_cast_on";
                stringId = R.string.qs_tile_cast_screen;
                break;
            case QSConstants.TILE_HOTSPOT:
                resourceName = "ic_qs_hotspot_on";
                stringId = R.string.qs_tile_hotspot;
                break;
            case QSConstants.TILE_NOTIFICATIONS:
                resourceName = "ic_qs_ringer_audible";
                stringId = R.string.qs_tile_notifications;
                break;
            case QSConstants.TILE_NFC:
                resourceName = "ic_qs_nfc_on";
                stringId = R.string.qs_tile_nfc;
                break;
            case QSConstants.TILE_COMPASS:
                resourceName = "ic_qs_compass_on";
                stringId = R.string.qs_tile_compass;
                break;
            case QSConstants.TILE_DATA:
                resourceName = "ic_qs_data_on";
                stringId = R.string.qs_tile_data;
                break;
            case QSConstants.TILE_BATTERY_SAVER:
                resourceName = "ic_qs_battery_saver_on";
                stringId = R.string.qs_battery_saver_tile;
                break;
            case QSConstants.TILE_SYNC:
                resourceName = "ic_qs_sync_on";
                stringId = R.string.qs_sync_tile;
                break;
            case QSConstants.TILE_BRIGHTNESS:
                resourceName = "ic_qs_brightness_auto_off_alpha";
                stringId = R.string.qs_brightness_tile;
                break;
            case QSConstants.TILE_EXPANDED_DESKTOP:
                resourceName = "ic_qs_expanded_desktop";
                stringId = R.string.qs_expanded_desktop_tile;
                break;
            case QSConstants.TILE_SCREEN_TIMEOUT:
                resourceName = "ic_qs_screen_timeout_vector";
                stringId = R.string.qs_tile_screen_timeout;
                break;
            case QSConstants.TILE_SCREEN_OFF:
                resourceName = "ic_qs_power";
                stringId = R.string.qs_screen_off_tile;
                break;
            case QSConstants.TILE_USB_TETHER:
                resourceName = "ic_qs_usb_tether_on";
                stringId = R.string.qs_tile_usb_tether;
                break;
            case QSConstants.TILE_SCREENSHOT:
                resourceName = "ic_qs_screenshot";
                stringId = R.string.qs_screenshot_tile;
                break;
            case QSConstants.TILE_LIVE_DISPLAY:
                resourceName ="ic_livedisplay_day";
                stringId = R.string.live_display_title;
                break;
            case QSConstants.TILE_LED:
                resourceName = "ic_qs_led_on";
                stringId = R.string.qs_tile_led;
                break;
	    	case QSConstants.TILE_REBOOT:
				resourceName = "ic_qs_reboot";
				stringId = R.string.qs_tile_reboot;
	    		break;
            case QSConstants.TILE_HEADS_UP:
                resourceName = "ic_qs_heads_up_on";
                stringId = R.string.qs_tile_heads_up;
                break;
            default:
                return null;
        }

        String name = stringId != -1 ? context.getString(stringId) : null;
        return new QSTileHolder(resourceName, tileType, name);
    }
}
