package DataProviders;

import org.testng.annotations.DataProvider;

public class DataProviderClass {


        @DataProvider(name = "PositiveTestDoubleNumberGenerator")
        public Object[][] getNumbersForPositiveTest() {
            return new Object[][]
                    {

                            {3.5, 2.1},
                            {5.3, -1.1},
                            {-3.3, 4.67},
                            {-25.7, -8.1},
                            {0.0, 0.0},
                            {8.6, 0.0},
                            {0.0, 6.2},
                            {-6.1, 0.0},
                            {0.0, -3.4},


                    };
        }

        @DataProvider(name = "PositiveTestLongNumberGenerator")
        public Object[][] getMinimumValuesForNegativeTest() {
            return new Object[][]
                    {
                            {2L, 1101L},
                            {3L, -1L},
                            {-3L, 4L},
                            {-25L, -8L},
                            {0L, 0L},
                            {8L, 0L},
                            {0L, 62L},
                            {-61L, 0L},
                            {0L, -3L},
                            {34L, 50L},
                            {-4L, -1L},

                    };
        }

        @DataProvider(name = "NegativeTestDoubleNumberGenerator")
        public Object[][] getMaximumValuesForNegativeTest() {
            return new Object[][]
                    {
                            {3.5, 3},
                            {4.9, -2},
                            {20.349, 0},
                            {-10.346, -9},
                            {15, 3.9},
                            {-11, 7.6},
                            {0L, 35.2},
                            {-30, -80.7},
                            {3, 9L},
                            {25L, -15},
                            {-15, 259L},
                            {-359L, -200},
                    };
        }

        @DataProvider(name = "NegativeTestLongNumberGenerator")
        public Object[][] getMaximumLongValuesForNegativeTest() {

            return new Object[][]
                    {
                            {35L, 29.6},
                            {26L, -39},
                            {-98, 65.9},
                            {-69, -26.90},
                            {26.90, 35L},
                            {-35,35L},
                            {0, 100L},
                            {-39.6, -1L},
                            {0, 389},
                            {96, -53.99},
                            {-99.1314,2.5},
                            {-37, -89.99},
                    };
        }

    @DataProvider(name = "ValuesForTrigonometicFunctions")
    public Object[][] getValuesForTrigonometicFunctions() {

        return new Object[][]
                {
                        {}
                };
    }

    @DataProvider(name = "NumbersForPositiveNegativeChecksGenerator")
    public Object[] createRandomNumbers()
    {
        return new Object[]{399L, -515L, 0L};
    }
    @DataProvider(name = "RightNumbersForSqrtFunctionGenerator")
    public Object[] createRightRandomNumbersForSqrtFunction()
    {
        return new Object[]{24.56,0.0};
    }

//    @DataProvider(name="NumbersForPowFunction")
//    public Object[][] createNumbersForPowAndSqrtFunctions()
//    {
//        return new Object[][]{
//                {0,0},
//                {2,0},
//                {0,2},
//                {3,6},
//                {3,-1},
//                {-3,9},
//                {-2,0},
//                {0,-3},
//                {-2,0},
//                {0,-32},
//                {-6,-5},
//        };
//    }


//        @DataProvider(name = "ProviderWithMinimumLongValues")
//        public Object[][] getMinimumLongValuesForNegativeTest() {
//            a = ThreadLocalRandom.current().nextDouble(0.00001, 10000.00001);
//            return new Object[][]
//                    {
//                            {a, Long.MIN_VALUE},
//                            {a, -Long.MIN_VALUE},
//                            {-a, Long.MIN_VALUE},
//                            {-a, -Long.MIN_VALUE},
//                            {Long.MIN_VALUE, a},
//                            {-Long.MIN_VALUE, a},
//                            {Long.MIN_VALUE, a},
//                            {-Long.MIN_VALUE, -a},
//                            {Long.MIN_VALUE, Long.MIN_VALUE},
//                            {Long.MIN_VALUE, -Long.MIN_VALUE},
//                            {-Long.MIN_VALUE, Long.MIN_VALUE},
//                            {-Long.MIN_VALUE, -Long.MIN_VALUE},
//                    };
//        }
//
//        @DataProvider(name = "ProviderWithInfinitiesAndNaNValues")
//        public Object[][] getInfinitiesAndNaNForNegativeTest() {
//            a = ThreadLocalRandom.current().nextDouble(0.00001, 10000.00001);
//            return new Object[][]
//                    {
//                            {a, Double.POSITIVE_INFINITY},
//                            {a, -Double.POSITIVE_INFINITY},
//                            {-a, Double.POSITIVE_INFINITY},
//                            {-a, -Double.POSITIVE_INFINITY},
//                            {Double.POSITIVE_INFINITY, a},
//                            {-Double.POSITIVE_INFINITY, a},
//                            {Double.POSITIVE_INFINITY, a},
//                            {-Double.POSITIVE_INFINITY, -a},
//                            {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
//                            {Double.POSITIVE_INFINITY, -Double.POSITIVE_INFINITY},
//                            {-Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
//                            {-Double.POSITIVE_INFINITY, -Double.POSITIVE_INFINITY},
//                            {a, Double.NEGATIVE_INFINITY},
//                            {a, -Double.NEGATIVE_INFINITY},
//                            {-a, Double.NEGATIVE_INFINITY},
//                            {-a, -Double.NEGATIVE_INFINITY},
//                            {Double.NEGATIVE_INFINITY, a},
//                            {-Double.NEGATIVE_INFINITY, a},
//                            {Double.NEGATIVE_INFINITY, a},
//                            {-Double.NEGATIVE_INFINITY, -a},
//                            {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY},
//                            {Double.NEGATIVE_INFINITY, -Double.NEGATIVE_INFINITY},
//                            {-Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY},
//                            {-Double.NEGATIVE_INFINITY, -Double.NEGATIVE_INFINITY},
//                            {a, Double.NaN},
//                            {a, -Double.NaN},
//                            {-a, Double.NaN},
//                            {-a, -Double.NaN},
//                            {Double.NaN, a},
//                            {-Double.NaN, a},
//                            {Double.NaN, a},
//                            {-Double.NaN, -a},
//                            {Double.NaN, Double.NaN},
//                            {Double.NaN, -Double.NaN},
//                            {-Double.NaN, Double.NaN},
//                            {-Double.NaN, -Double.NaN},
//                    };
//
//        }
//    }

}
