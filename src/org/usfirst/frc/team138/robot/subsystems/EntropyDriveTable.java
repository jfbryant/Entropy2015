package org.usfirst.frc.team138.robot.subsystems;

public class EntropyDriveTable {
	//entropy drive table 2/12/2015 (Tote / Container robot)
	public static final double[] left_lookup_radius = {1.3,1.4,1.6,1.9,2.1,2.5,3.0,3.7,4.5,5.8,7.6,10.4,15.1,24.0,43.9,104.5, 0 ,-104.5,-43.9,-24.0,-15.1,-10.4,-7.6,-5.8,-4.5,-3.7,-3.0,-2.5,-2.1,-1.9,-1.6,-1.4,-1.3};
	public static final double[] left_lookupx = {-1.000,-0.938,-0.875,-0.813,-0.750,-0.688,-0.625,-0.563,-0.500,-0.438,-0.375,-0.313,-0.250,-0.188,-0.125,-0.063,0.000,0.063,0.125,0.188,0.250,0.313,0.375,0.438,0.500,0.563,0.625,0.688,0.750,0.813,0.875,0.938,1.000};
	public static final double[] left_lookupy = {-0.800,-0.750,-0.700,-0.650,-0.600,-0.550,-0.500,-0.450,-0.400,-0.350,-0.300,-0.250,-0.200,-0.150,-0.100,-.050,0.000,0.050,0.100,0.150,0.200,0.250,0.300,0.350,0.400,0.450,0.500,0.550,0.600,0.650,0.700,0.750,0.800};
	public static final double[][] left_fast_njxy = {
	//(Throttle),-1.000,-0.938,-0.875,-0.813,-0.750,-0.688,-0.625,-0.563,-0.500,-0.438,-0.375,-0.313,-0.250,-0.188,-0.125,-0.063,0.000,0.063,0.125,0.188,0.250,0.313,0.375,0.438,0.500,0.563,0.625,0.688,0.750,0.813,0.875,0.938,1.000,,Throttle,-1.000,-0.938,-0.875,-0.813,-0.750,-0.688,-0.625,-0.563,-0.500,-0.438,-0.375,-0.313,-0.250,-0.188,-0.125,-0.063,0.000,0.063,0.125,0.188,0.250,0.313,0.375,0.438,0.500,0.563,0.625,0.688,0.750,0.813,0.875,0.938,1.000
		{0.150,0.314,0.465,0.561,0.628,0.678,0.715,0.745,0.759,0.780,0.797,0.812,0.825,0.863,0.887,0.904,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000},
		{0.150,0.316,0.466,0.562,0.629,0.678,0.716,0.746,0.759,0.780,0.797,0.812,0.825,0.863,0.887,0.899,0.947,0.995,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000},
		{0.150,0.317,0.467,0.563,0.630,0.679,0.717,0.746,0.759,0.780,0.793,0.801,0.808,0.828,0.840,0.849,0.894,0.939,0.947,0.960,0.979,0.986,0.995,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000},
		{0.150,0.318,0.469,0.565,0.631,0.680,0.718,0.747,0.726,0.737,0.746,0.754,0.760,0.779,0.790,0.798,0.841,0.883,0.891,0.903,0.921,0.928,0.935,0.945,0.956,1.000,1.000,1.000,1.000,1.000,1.000,1.000,1.000},
		{0.150,0.320,0.470,0.566,0.632,0.679,0.700,0.717,0.680,0.690,0.699,0.706,0.712,0.729,0.740,0.748,0.788,0.827,0.835,0.846,0.863,0.869,0.876,0.885,0.895,0.958,0.975,0.996,1.000,1.000,1.000,1.000,1.000},
		{0.150,0.322,0.472,0.567,0.608,0.636,0.656,0.672,0.634,0.644,0.652,0.658,0.664,0.680,0.690,0.697,0.734,0.771,0.778,0.789,0.805,0.810,0.817,0.825,0.835,0.897,0.912,0.933,0.960,1.000,1.000,1.000,1.000},
		{0.150,0.324,0.470,0.530,0.568,0.594,0.613,0.627,0.588,0.597,0.604,0.611,0.616,0.631,0.640,0.647,0.681,0.716,0.722,0.731,0.747,0.752,0.758,0.765,0.775,0.836,0.850,0.869,0.894,0.932,0.992,1.000,1.000},
		{0.150,0.327,0.437,0.493,0.528,0.551,0.569,0.582,0.542,0.550,0.557,0.563,0.568,0.582,0.591,0.596,0.628,0.660,0.666,0.674,0.688,0.693,0.699,0.706,0.714,0.774,0.788,0.805,0.829,0.863,0.919,1.000,1.000},
		{0.150,0.310,0.405,0.455,0.487,0.509,0.525,0.537,0.496,0.504,0.510,0.515,0.520,0.533,0.541,0.546,0.575,0.604,0.609,0.617,0.630,0.635,0.640,0.646,0.654,0.713,0.725,0.741,0.763,0.795,0.845,0.940,1.000},
		{0.150,0.286,0.372,0.418,0.447,0.467,0.481,0.492,0.450,0.457,0.463,0.468,0.472,0.483,0.491,0.496,0.522,0.548,0.553,0.560,0.572,0.576,0.581,0.586,0.593,0.652,0.663,0.677,0.697,0.726,0.772,0.858,1.000},
		{0.150,0.262,0.339,0.381,0.406,0.424,0.437,0.447,0.405,0.411,0.416,0.420,0.424,0.434,0.441,0.445,0.469,0.492,0.497,0.503,0.514,0.517,0.522,0.527,0.533,0.591,0.600,0.613,0.631,0.657,0.698,0.775,0.968},
		{0.150,0.238,0.306,0.343,0.366,0.382,0.393,0.402,0.359,0.364,0.369,0.373,0.376,0.385,0.391,0.395,0.416,0.437,0.441,0.446,0.455,0.459,0.462,0.467,0.473,0.529,0.538,0.549,0.565,0.588,0.625,0.693,0.864},
		{0.150,0.214,0.274,0.306,0.326,0.339,0.349,0.357,0.313,0.318,0.322,0.325,0.328,0.336,0.341,0.344,0.363,0.381,0.384,0.389,0.397,0.400,0.403,0.407,0.412,0.468,0.476,0.486,0.499,0.519,0.551,0.611,0.760},
		{0.150,0.190,0.241,0.268,0.285,0.297,0.305,0.312,0.267,0.271,0.274,0.277,0.280,0.287,0.291,0.294,0.309,0.325,0.328,0.332,0.339,0.341,0.344,0.348,0.352,0.407,0.413,0.422,0.433,0.451,0.478,0.529,0.656},
		{0.150,0.166,0.208,0.231,0.245,0.255,0.262,0.267,0.221,0.225,0.227,0.230,0.232,0.237,0.241,0.243,0.256,0.269,0.272,0.275,0.281,0.283,0.285,0.288,0.291,0.346,0.351,0.358,0.368,0.382,0.404,0.447,0.552},
		{0.150,0.150,0.175,0.193,0.204,0.212,0.218,0.222,0.175,0.178,0.180,0.182,0.184,0.188,0.191,0.193,0.203,0.213,0.215,0.218,0.223,0.224,0.226,0.228,0.231,0.284,0.289,0.294,0.302,0.313,0.331,0.364,0.448},
		{-0.800,-0.800,-0.800,-0.800,-0.800,-0.650,-0.650,-0.650,-0.650,-0.650,-0.500,-0.500,-0.500,-0.500,0.000,0.000,0.000,0.000,0.000,0.500,0.500,0.500,0.500,0.650,0.650,0.650,0.650,0.650,0.800,0.800,0.800,0.800,0.800},
		{-0.150,-0.150,-0.175,-0.193,-0.204,-0.212,-0.218,-0.222,-0.175,-0.178,-0.180,-0.182,-0.184,-0.188,-0.191,-0.193,-0.203,-0.213,-0.215,-0.218,-0.223,-0.224,-0.226,-0.228,-0.231,-0.284,-0.289,-0.294,-0.302,-0.313,-0.331,-0.364,-0.448},
		{-0.150,-0.166,-0.208,-0.231,-0.245,-0.255,-0.262,-0.267,-0.221,-0.225,-0.227,-0.230,-0.232,-0.237,-0.241,-0.243,-0.256,-0.269,-0.272,-0.275,-0.281,-0.283,-0.285,-0.288,-0.291,-0.346,-0.351,-0.358,-0.368,-0.382,-0.404,-0.447,-0.552},
		{-0.150,-0.190,-0.241,-0.268,-0.285,-0.297,-0.305,-0.312,-0.267,-0.271,-0.274,-0.277,-0.280,-0.287,-0.291,-0.294,-0.309,-0.325,-0.328,-0.332,-0.339,-0.341,-0.344,-0.348,-0.352,-0.407,-0.413,-0.422,-0.433,-0.451,-0.478,-0.529,-0.656},
		{-0.150,-0.214,-0.274,-0.306,-0.326,-0.339,-0.349,-0.357,-0.313,-0.318,-0.322,-0.325,-0.328,-0.336,-0.341,-0.344,-0.363,-0.381,-0.384,-0.389,-0.397,-0.400,-0.403,-0.407,-0.412,-0.468,-0.476,-0.486,-0.499,-0.519,-0.551,-0.611,-0.760},
		{-0.150,-0.238,-0.306,-0.343,-0.366,-0.382,-0.393,-0.402,-0.359,-0.364,-0.369,-0.373,-0.376,-0.385,-0.391,-0.395,-0.416,-0.437,-0.441,-0.446,-0.455,-0.459,-0.462,-0.467,-0.473,-0.529,-0.538,-0.549,-0.565,-0.588,-0.625,-0.693,-0.864},
		{-0.150,-0.262,-0.339,-0.381,-0.406,-0.424,-0.437,-0.447,-0.405,-0.411,-0.416,-0.420,-0.424,-0.434,-0.441,-0.445,-0.469,-0.492,-0.497,-0.503,-0.514,-0.517,-0.522,-0.527,-0.533,-0.591,-0.600,-0.613,-0.631,-0.657,-0.698,-0.775,-0.968},
		{-0.150,-0.286,-0.372,-0.418,-0.447,-0.467,-0.481,-0.492,-0.450,-0.457,-0.463,-0.468,-0.472,-0.483,-0.491,-0.496,-0.522,-0.548,-0.553,-0.560,-0.572,-0.576,-0.581,-0.586,-0.593,-0.652,-0.663,-0.677,-0.697,-0.726,-0.772,-0.858,-1.000},
		{-0.150,-0.310,-0.405,-0.455,-0.487,-0.509,-0.525,-0.537,-0.496,-0.504,-0.510,-0.515,-0.520,-0.533,-0.541,-0.546,-0.575,-0.604,-0.609,-0.617,-0.630,-0.635,-0.640,-0.646,-0.654,-0.713,-0.725,-0.741,-0.763,-0.795,-0.845,-0.940,-1.000},
		{-0.150,-0.327,-0.437,-0.493,-0.528,-0.551,-0.569,-0.582,-0.542,-0.550,-0.557,-0.563,-0.568,-0.582,-0.591,-0.596,-0.628,-0.660,-0.666,-0.674,-0.688,-0.693,-0.699,-0.706,-0.714,-0.774,-0.788,-0.805,-0.829,-0.863,-0.919,-1.000,-1.000},
		{-0.150,-0.324,-0.470,-0.530,-0.568,-0.594,-0.613,-0.627,-0.588,-0.597,-0.604,-0.611,-0.616,-0.631,-0.640,-0.647,-0.681,-0.716,-0.722,-0.731,-0.747,-0.752,-0.758,-0.765,-0.775,-0.836,-0.850,-0.869,-0.894,-0.932,-0.992,-1.000,-1.000},
		{-0.150,-0.322,-0.472,-0.567,-0.608,-0.636,-0.656,-0.672,-0.634,-0.644,-0.652,-0.658,-0.664,-0.680,-0.690,-0.697,-0.734,-0.771,-0.778,-0.789,-0.805,-0.810,-0.817,-0.825,-0.835,-0.897,-0.912,-0.933,-0.960,-1.000,-1.000,-1.000,-1.000},
		{-0.150,-0.320,-0.470,-0.566,-0.632,-0.679,-0.700,-0.717,-0.680,-0.690,-0.699,-0.706,-0.712,-0.729,-0.740,-0.748,-0.788,-0.827,-0.835,-0.846,-0.863,-0.869,-0.876,-0.885,-0.895,-0.958,-0.975,-0.996,-1.000,-1.000,-1.000,-1.000,-1.000},
		{-0.150,-0.318,-0.469,-0.565,-0.631,-0.680,-0.718,-0.747,-0.726,-0.737,-0.746,-0.754,-0.760,-0.779,-0.790,-0.798,-0.841,-0.883,-0.891,-0.903,-0.921,-0.928,-0.935,-0.945,-0.956,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000},
		{-0.150,-0.317,-0.467,-0.563,-0.630,-0.679,-0.717,-0.746,-0.759,-0.780,-0.793,-0.801,-0.808,-0.828,-0.840,-0.849,-0.894,-0.939,-0.947,-0.960,-0.979,-0.986,-0.995,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000},
		{-0.150,-0.316,-0.466,-0.562,-0.629,-0.678,-0.716,-0.746,-0.759,-0.780,-0.797,-0.812,-0.825,-0.863,-0.887,-0.899,-0.947,-0.995,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000},
		{-0.150,-0.314,-0.465,-0.561,-0.628,-0.678,-0.715,-0.745,-0.759,-0.780,-0.797,-0.812,-0.825,-0.863,-0.887,-0.904,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000,-1.000},
	};

}