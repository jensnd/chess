package chess;

public class KingSituation {

    int[][] entity = new int[8][8];
    private boolean Finalresult = false;

    public KingSituation(int i, int j, boolean number, int[][] maps, int[][] location) {

        int[][] result = new int[8][8];
        int[][] result1 = new int[8][8];

        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 8; l++) {
                result[k][l] = 0;

                if (location[k][l] > 0) {
               
                    entity[k][l] = 1;
                    result[k][l] = 1;
                } else {
                    entity[k][l] = 0;
                }
                 result[i][j]=0;
            }
        }

        if (number == true) {

            for (int k = 0; k < location.length; k++) {
                for (int l = 0; l < location.length; l++) {
                    if (location[k][l] == 1) {

                        if (k + 1 > -1 && k + 1 < 8 && l - 1 > -1 && l - 1 < 8) {
                            result[k + 1][l - 1] = 1;
                        }

                        if (k + 1 > -1 && k + 1 < 8 && l + 1 > -1 && l + 1 < 8) {
                            result[k + 1][l + 1] = 1;
                        }

                    }

                    if (location[k][l] == 2) {

                        Rook RookTest = new Rook(k, l, entity, false, maps);
                        result1 = RookTest.information();

                        for (int m = 0; m < 8; m++) {
                            for (int n = 0; n < 8; n++) {
                                if (result1[m][n] == 1) {
                                    result[m][n] = 1;
                                }
                            }
                        }

                    }
                    if (location[k][l] == 3) {

                        Knight knightTest = new Knight(k, l, entity, false, maps);
                        result1 = knightTest.information();

                        for (int m = 0; m < 8; m++) {
                            for (int n = 0; n < 8; n++) {
                                if (result1[m][n] == 1) {
                                    result[m][n] = 1;
                                }
                            }
                        }

                    }

                    if (location[k][l] == 4) {

                        Bishop bishopTest = new Bishop(k, l, false, maps);
                        result1 = bishopTest.information();

                        for (int m = 0; m < 8; m++) {
                            for (int n = 0; n < 8; n++) {
                                if (result1[m][n] == 1) {
                                    result[m][n] = 1;
                                }
                            }
                        }

                    }

                    if (location[k][l] == 5) {

                        Queen QueenTest = new Queen(k, l, entity, false, maps);
                        result1 = QueenTest.information();

                        for (int m = 0; m < 8; m++) {
                            for (int n = 0; n < 8; n++) {
                                if (result1[m][n] == 1) {
                                    result[m][n] = 1;
                                }

                            }
                        }

                    }

                }
            }

            if (result[i][j] == 1) {
                Finalresult = true;
            }
        }

        if (number == false) {

            for (int k = 0; k < location.length; k++) {
                for (int l = 0; l < location.length; l++) {

                    if (location[k][l] == 11) {

                        if (k - 1 > -1 && k - 1 < 8 && l - 1 > -1 && l - 1 < 8) {
                            result[k - 1][l - 1] = 1;
                        }

                        if (k - 1 > -1 && k - 1 < 8 && l + 1 > -1 && l + 1 < 8) {
                            result[k - 1][l + 1] = 1;
                        }

                    }

                    if (location[k][l] == 12) {

                        Rook RookTest = new Rook(k, l, entity, true, maps);
                        result1 = RookTest.information();

                        for (int m = 0; m < 8; m++) {
                            for (int n = 0; n < 8; n++) {
                                if (result1[m][n] == 1) {
                                    result[m][n] = 1;
                                }
                            }
                        }

                    }
                    if (location[k][l] == 13) {

                        Knight knightTest = new Knight(k, l, entity, true, maps);
                        result1 = knightTest.information();

                        for (int m = 0; m < 8; m++) {
                            for (int n = 0; n < 8; n++) {
                                if (result1[m][n] == 1) {
                                    result[m][n] = 1;
                                }
                            }
                        }

                    }

                    if (location[k][l] == 14) {

                        Bishop bishopTest = new Bishop(k, l, true, maps);
                        result1 = bishopTest.information();

                        for (int m = 0; m < 8; m++) {
                            for (int n = 0; n < 8; n++) {
                                if (result1[m][n] == 1) {
                                    result[m][n] = 1;
                                }
                            }
                        }

                    }

                    if (location[k][l] == 15) {

                        Queen QueenTest = new Queen(k, l, entity, true, maps);
                        result1 = QueenTest.information();

                        for (int m = 0; m < 8; m++) {
                            for (int n = 0; n < 8; n++) {
                                if (result1[m][n] == 1) {
                                    result[m][n] = 1;
                                }

                            }
                        }

                    }

                }
            }

            if (result[i][j] == 1) {
                Finalresult = true;
            }
        }

    }

    public boolean information() {
        return Finalresult;
    }
}
