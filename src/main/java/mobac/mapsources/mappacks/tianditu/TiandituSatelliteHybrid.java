package mobac.mapsources.mappacks.tianditu;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import mobac.exceptions.TileException;
import mobac.exceptions.UnrecoverableDownloadException;
import mobac.mapsources.AbstractHttpMapSource;
import mobac.mapsources.AbstractMultiLayerMapSource;
import mobac.program.Logging;
import mobac.program.interfaces.MapSource;
import mobac.program.interfaces.MapSourceTextAttribution;
import mobac.program.model.TileImageType;
import mobac.program.tilestore.TileStore;
import mobac.utilities.Utilities;

/**
 * http://openseamap.org/
 * @see OpenSeaMapLayer
 */
public class TiandituSatelliteHybrid extends AbstractMultiLayerMapSource {

	public TiandituSatelliteHybrid() {
		super("TiandituSatelliteHybrid", TileImageType.PNG);
		mapSources = new MapSource[] { new TiandituSatellite(), new TiandituStreetLabel() };
		initializeValues();
	}

	@Override
	public String toString() {
		return "Tianditu Satellite Hybrid";
	}
}