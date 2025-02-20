package pl.dido.image.zx;

import pl.dido.image.utils.Config;

public class ZXConfig extends Config {
	
	public ZXConfig() {
		super();
		color_alg = NEAREST_COLOR.PERCEPTED;
		dither_alg = DITHERING.ATKINSON;
		
		dithering = true;
		highContrast = HIGH_CONTRAST.SWAHE;
		
		windowSize = 20;
	}

	@Override
	public int getWidth() {
		return 256;
	}

	@Override
	public int getHeight() {
		return 192;
	}
	
	@Override
	public int getScreenWidth() {
		return 384;
	}

	@Override
	public int getScreenHeight() {
		return 288;
	}
}