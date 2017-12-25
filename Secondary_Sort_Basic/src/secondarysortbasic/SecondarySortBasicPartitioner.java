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
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Partitioner;

public class SecondarySortBasicPartitioner extends
  	Partitioner<CompositeKeyWritable, NullWritable> {

	@Override
	public int getPartition(CompositeKeyWritable key, NullWritable value,
			int numReduceTasks) {

		return (key.getDeptNo().hashCode() % numReduceTasks);
	}
}