/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondarysortbasic;

/**
 *
 * @author abhi1
 */
import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class SecondarySortBasicReducer
  	extends
		Reducer<CompositeKeyWritable, NullWritable, CompositeKeyWritable, NullWritable> {

	@Override
	public void reduce(CompositeKeyWritable key, Iterable<NullWritable> values,
			Context context) throws IOException, InterruptedException {

		for (NullWritable value : values) {

			context.write(key, NullWritable.get());
		}

	}
}