package org.dimhat.demo7.artpen;

/**
 * 桥接模式
 * 
 * @author dimhat
 * @date 2016年5月27日 下午2:04:34
 */
public class Main {

	public static void main(String[] args) {
		Artist painter = new Painter();
		Artist calligrapher = new Calligrapher();

		Pen writeBrushes = new WriteBrushes();
		Pen painBrushes = new Paintbrushes();

		painter.setPen(writeBrushes);
		painter.create();
		painter.setPen(painBrushes);
		painter.create();

		calligrapher.setPen(writeBrushes);
		calligrapher.create();
		calligrapher.setPen(painBrushes);
		calligrapher.create();
	}

}
