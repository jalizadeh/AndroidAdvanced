package jalizadeh.com.androidadvanced.TopAndBottomAppBars;


import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import java.lang.reflect.Field;

//how to disable button shifting
//https://stackoverflow.com/questions/40176244/how-to-disable-bottomnavigationview-shift-mode
//but, setShiftingMode is not recognised here

// read solution here:
//https://stackoverflow.com/questions/51342200/cannot-resolve-method-setshiftingmodeboolean-in-bottomnavigationview
/*
public class BottomNavigationViewHelper {
    private static BottomNavigationMenuView menuView;
    private  static   BottomNavigationItemView item;


    public static void disableShiftMode(BottomNavigationView view) {
        menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                item = (BottomNavigationItemView) menuView.getChildAt(i);
                //noinspection RestrictedApi
                item.setShiftingMode(false);
                // set once again checked value, so view will be updated
                //noinspection RestrictedApi
                item.setChecked(item.getItemData().isChecked());
            }
        } catch (NoSuchFieldException e) {
            Log.e("BNVHelper", "Unable to get shift mode field", e);
        } catch (IllegalAccessException e) {
            Log.e("BNVHelper", "Unable to change value of shift mode", e);
        }
    }

}

*/