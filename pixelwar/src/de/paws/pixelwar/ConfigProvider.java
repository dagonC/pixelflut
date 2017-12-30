package de.paws.pixelwar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

/**
 *
 *
 * Reads the configuration from storage and provides it in a usable way.
 *
 */
public class ConfigProvider {

	public Config readConfig(final String fileName) {
		final ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

		Config config = null;
		try {
			config = mapper.readValue(getFileContent(fileName), Config.class);
		} catch (final JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (final JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return config;
	}

	private String getFileContent(final String fileName) throws Exception {
		final File file = new File(fileName);
		final FileInputStream fis = new FileInputStream(file);
		final byte[] data = new byte[(int) file.length()];
		fis.read(data);
		fis.close();

		final String str = new String(data, "UTF-8");

		return str;
	}
}
