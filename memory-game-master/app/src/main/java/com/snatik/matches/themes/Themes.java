package com.snatik.matches.themes;

import android.graphics.Bitmap;

import com.snatik.matches.common.Shared;
import com.snatik.matches.utils.Utils;

import java.util.ArrayList;

public class Themes {

	public static String URI_DRAWABLE = "drawable://";

	public static Theme createAnimalsTheme() {
		Theme theme = new Theme();
		theme.id = 1;
		theme.name = "Animals";
		theme.backgroundImageUrl = URI_DRAWABLE + "back_animals";
		theme.tileImageUrls = new ArrayList<String>();
		// 40 drawables
		for (int i = 1; i <= 9; i++) {
			theme.tileImageUrls.add(URI_DRAWABLE + String.format("animals_%d", i));
			System.out.println(theme.tileImageUrls.get(i-1));
		}
		for (int j = 1; j <= 9; j++) {
			theme.tileImageUrls.add(URI_DRAWABLE + String.format("animals_%da", j));
			System.out.println(theme.tileImageUrls.get(j+2));
		}
		return theme;
	}

	public static Theme createMosterTheme() {
		Theme theme = new Theme();
		theme.id = 2;
		theme.name = "Flowers";
		theme.backgroundImageUrl = URI_DRAWABLE + "background";
		theme.tileImageUrls = new ArrayList<String>();
		// 40 drawables
		for (int i = 1; i <= 9; i++) {
			theme.tileImageUrls.add(URI_DRAWABLE + String.format("flowers_%d", i));
		}
		for (int j = 1; j <= 9; j++) {
			theme.tileImageUrls.add(URI_DRAWABLE + String.format("flowers_%da", j));
			System.out.println(theme.tileImageUrls.get(j+2));
		}
		return theme;
	}

	public static Theme createEmojiTheme() {
		Theme theme = new Theme();
		theme.id = 3;
		theme.name = "Colors";
		theme.backgroundImageUrl = URI_DRAWABLE + "background";
		theme.tileImageUrls = new ArrayList<String>();
		// 40 drawables
		for (int i = 1; i <= 9; i++) {
			theme.tileImageUrls.add(URI_DRAWABLE + String.format("colors_%d", i));
		}
		for (int j = 1; j <= 9; j++) {
			theme.tileImageUrls.add(URI_DRAWABLE + String.format("colors_%da", j));
			System.out.println(theme.tileImageUrls.get(j+2));
		}
		return theme;
	}
	
	public static Bitmap getBackgroundImage(Theme theme) {
		String drawableResourceName = theme.backgroundImageUrl.substring(Themes.URI_DRAWABLE.length());
		int drawableResourceId = Shared.context.getResources().getIdentifier(drawableResourceName, "drawable", Shared.context.getPackageName());
		Bitmap bitmap = Utils.scaleDown(drawableResourceId, Utils.screenWidth(), Utils.screenHeight());
		return bitmap;
	}

}
