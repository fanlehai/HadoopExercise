package com.fanlehai.hadoop.sort;

import java.io.IOException;
import java.util.Map;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.fanlehai.hadoop.utils.MRDPUtils;

public class LastAccessDateMap extends Mapper<Object, Text, Text, Text> {

	private Text outkey = new Text();

	@Override
	public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

		// Parse the input string into a nice map
		Map<String, String> parsed = MRDPUtils.transformXmlToMap(value.toString());

		String date = parsed.get("LastAccessDate");
		if (date != null) {
			outkey.set(date);
			context.write(outkey, new Text(parsed.get("Id")));
		}
	}
}
