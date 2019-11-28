package by.epam.petropavlovskaya.task3;

class Test_Matrix {

    public static double[][] testMinMax = { {14.0157, 26.1425, 36.0659, 43.9286},
                                            {23.8895, 21.0183, 2.4961,  49.9076},   // min[1][2]
                                            {15.4261, 41.5647, 9.7634,  17.0121},   // max[2][1]
                                            {30.5428, 40.5847, 19.6366, 21.2930}};

    public static double[][] testMinMax1 = {{14.0157, 26.1425, 36.0659, 43.9286},
                                            {23.8895, 21.0183, 2.4961,  49.9076},   // min[1][2]
                                            {15.4261, 40.5647, 9.7634,  17.0121},   // max = -1
                                            {30.5428, 40.5847, 19.6366, 21.2930}};

    public static double[][] testMinMax2 = {{8.2343,    3.0636,  	17.6459,  	7.2906,  	0.8956},
                                            {19.2168,  	9.6888,  	0.2563,  	15.5820,  	16.6782},   // min[1][2]
                                            {7.1983,  	4.6075,  	6.1890,  	6.0828,  	16.6780},
                                            {18.0916,  	16.3584,  	17.8850,  	18.5819,  	4.6165},    // max[3][3]
                                            {17.1421,  	12.4466,  	12.7779,  	9.4995,  	11.7910}    };

    // Матрицы для транспонирования

    public static int[][] testTransp = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}    };

    public static int[][] testTransp1 = {
            { 1,  2,  3,  4,  5},
            { 6,  7,  8,  9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}    };

}
