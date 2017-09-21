package com;

import com.android.ide.common.vectordrawable.VdCommandLineTool;

/**
 * Created by Rayson Yeung on 20/9/2017.
 */

public class Main {
	public static void main(String[] args) {
		args = new String[] { "-in", args[0], "-out", args[1], "-c" };
		VdCommandLineTool.main(args);
	}
}
