public class StudentTester2 {

    public static void main(String[] args) {

        // checknumPaths();

        // checkIsSumOf();

        checkIsSink();

        checkFind();

    }

    // private static void checknumPaths() {
    // int[][] mat4 = {
    // {1, 2, 3},
    // {4, 5, 6},
    // {7, 8, 9}};

    // int x1 = 0,  y1 = 0, x2 = 1, y2 = 0;

    // if(0 != Ex14.numPaths(mat4, x1, y1, x2, y2))
    // System.out.println("checknumPaths() is failed");

    // }

    // private static void checkIsSumOf() {
    // if(Ex14.isSumOf(new int[] {4,5}, 11) || !Ex14.isSumOf(new int[] {4,5}, 13))
    // System.out.println("checkIsSumOf() is failed");

    // }

    private static void checkFind() {
        int[][] mat = {
                {1, 2},
                {3, 4}};

        int[][] mat2 = { 
                {-4, -2, 5, 9},
                {2, 5, 12, 13},
                {13, 20, 25, 25},
                {22, 24, 49, 57}};
        int[][] mat3 = {
                {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341},
                {2, 3, 6, 7, 18, 19, 22, 23, 66, 67, 70, 71, 82, 83, 86, 87, 258, 259, 262, 263, 274, 275, 278, 279, 322, 323, 326, 327, 338, 339, 342, 343},
                {8, 9, 12, 13, 24, 25, 28, 29, 72, 73, 76, 77, 88, 89, 92, 93, 264, 265, 268, 269, 280, 281, 284, 285, 328, 329, 332, 333, 344, 345, 348, 349},
                {10, 11, 14, 15, 26, 27, 30, 31, 74, 75, 78, 79, 90, 91, 94, 95, 266, 267, 270, 271, 282, 283, 286, 287, 330, 331, 334, 335, 346, 347, 350, 351},
                {32, 33, 36, 37, 48, 49, 52, 53, 96, 97, 100, 101, 112, 113, 116, 117, 288, 289, 292, 293, 304, 305, 308, 309, 352, 353, 356, 357, 368, 369, 372, 373},
                {34, 35, 38, 39, 50, 51, 54, 55, 98, 99, 102, 103, 114, 115, 118, 119, 290, 291, 294, 295, 306, 307, 310, 311, 354, 355, 358, 359, 370, 371, 374, 375},
                {40, 41, 44, 45, 56, 57, 60, 61, 104, 105, 108, 109, 120, 121, 124, 125, 296, 297, 300, 301, 312, 313, 316, 317, 360, 361, 364, 365, 376, 377, 380, 381},
                {42, 43, 46, 47, 58, 59, 62, 63, 106, 107, 110, 111, 122, 123, 126, 127, 298, 299, 302, 303, 314, 315, 318, 319, 362, 363, 366, 367, 378, 379, 382, 383},
                {128, 129, 132, 133, 144, 145, 148, 149, 192, 193, 196, 197, 208, 209, 212, 213, 384, 385, 388, 389, 400, 401, 404, 405, 448, 449, 452, 453, 464, 465, 468, 469},
                {130, 131, 134, 135, 146, 147, 150, 151, 194, 195, 198, 199, 210, 211, 214, 215, 386, 387, 390, 391, 402, 403, 406, 407, 450, 451, 454, 455, 466, 467, 470, 471},
                {136, 137, 140, 141, 152, 153, 156, 157, 200, 201, 204, 205, 216, 217, 220, 221, 392, 393, 396, 397, 408, 409, 412, 413, 456, 457, 460, 461, 472, 473, 476, 477},
                {138, 139, 142, 143, 154, 155, 158, 159, 202, 203, 206, 207, 218, 219, 222, 223, 394, 395, 398, 399, 410, 411, 414, 415, 458, 459, 462, 463, 474, 475, 478, 479},
                {160, 161, 164, 165, 176, 177, 180, 181, 224, 225, 228, 229, 240, 241, 244, 245, 416, 417, 420, 421, 432, 433, 436, 437, 480, 481, 484, 485, 496, 497, 500, 501},
                {162, 163, 166, 167, 178, 179, 182, 183, 226, 227, 230, 231, 242, 243, 246, 247, 418, 419, 422, 423, 434, 435, 438, 439, 482, 483, 486, 487, 498, 499, 502, 503},
                {168, 169, 172, 173, 184, 185, 188, 189, 232, 233, 236, 237, 248, 249, 252, 253, 424, 425, 428, 429, 440, 441, 444, 445, 488, 489, 492, 493, 504, 505, 508, 509},
                {170, 171, 174, 175, 186, 187, 190, 191, 234, 235, 238, 239, 250, 251, 254, 255, 426, 427, 430, 431, 442, 443, 446, 447, 490, 491, 494, 495, 506, 507, 510, 511},
                {512, 513, 516, 517, 528, 529, 532, 533, 576, 577, 580, 581, 592, 593, 596, 597, 768, 769, 772, 773, 784, 785, 788, 789, 832, 833, 836, 837, 848, 849, 852, 853},
                {514, 515, 518, 519, 530, 531, 534, 535, 578, 579, 582, 583, 594, 595, 598, 599, 770, 771, 774, 775, 786, 787, 790, 791, 834, 835, 838, 839, 850, 851, 854, 855},
                {520, 521, 524, 525, 536, 537, 540, 541, 584, 585, 588, 589, 600, 601, 604, 605, 776, 777, 780, 781, 792, 793, 796, 797, 840, 841, 844, 845, 856, 857, 860, 861},
                {522, 523, 526, 527, 538, 539, 542, 543, 586, 587, 590, 591, 602, 603, 606, 607, 778, 779, 782, 783, 794, 795, 798, 799, 842, 843, 846, 847, 858, 859, 862, 863},
                {544, 545, 548, 549, 560, 561, 564, 565, 608, 609, 612, 613, 624, 625, 628, 629, 800, 801, 804, 805, 816, 817, 820, 821, 864, 865, 868, 869, 880, 881, 884, 885},
                {546, 547, 550, 551, 562, 563, 566, 567, 610, 611, 614, 615, 626, 627, 630, 631, 802, 803, 806, 807, 818, 819, 822, 823, 866, 867, 870, 871, 882, 883, 886, 887},
                {552, 553, 556, 557, 568, 569, 572, 573, 616, 617, 620, 621, 632, 633, 636, 637, 808, 809, 812, 813, 824, 825, 828, 829, 872, 873, 876, 877, 888, 889, 892, 893},
                {554, 555, 558, 559, 570, 571, 574, 575, 618, 619, 622, 623, 634, 635, 638, 639, 810, 811, 814, 815, 826, 827, 830, 831, 874, 875, 878, 879, 890, 891, 894, 895},
                {640, 641, 644, 645, 656, 657, 660, 661, 704, 705, 708, 709, 720, 721, 724, 725, 896, 897, 900, 901, 912, 913, 916, 917, 960, 961, 964, 965, 976, 977, 980, 981},
                {642, 643, 646, 647, 658, 659, 662, 663, 706, 707, 710, 711, 722, 723, 726, 727, 898, 899, 902, 903, 914, 915, 918, 919, 962, 963, 966, 967, 978, 979, 982, 983},
                {648, 649, 652, 653, 664, 665, 668, 669, 712, 713, 716, 717, 728, 729, 732, 733, 904, 905, 908, 909, 920, 921, 924, 925, 968, 969, 972, 973, 984, 985, 988, 989},
                {650, 651, 654, 655, 666, 667, 670, 671, 714, 715, 718, 719, 730, 731, 734, 735, 906, 907, 910, 911, 922, 923, 926, 927, 970, 971, 974, 975, 986, 987, 990, 991},
                {672, 673, 676, 677, 688, 689, 692, 693, 736, 737, 740, 741, 752, 753, 756, 757, 928, 929, 932, 933, 944, 945, 948, 949, 992, 993, 996, 997, 1008, 1009, 1012, 1013},
                {674, 675, 678, 679, 690, 691, 694, 695, 738, 739, 742, 743, 754, 755, 758, 759, 930, 931, 934, 935, 946, 947, 950, 951, 994, 995, 998, 999, 1010, 1011, 1014, 1015},
                {680, 681, 684, 685, 696, 697, 700, 701, 744, 745, 748, 749, 760, 761, 764, 765, 936, 937, 940, 941, 952, 953, 956, 957, 1000, 1001, 1004, 1005, 1016, 1017, 1020, 1021},
                {682, 683, 686, 687, 698, 699, 702, 703, 746, 747, 750, 751, 762, 763, 766, 767, 938, 939, 942, 943, 954, 955, 958, 959, 1002, 1003, 1006, 1007, 1018, 1019, 1022, 1023}
            };

        if(!Ex14.find(mat, 1))
            System.out.println("checkFind1() is failed");
        else
            System.out.println("checkFind1() is success");
        if(!Ex14.find(mat2, -4))
            System.out.println("checkFind2() is failed");
        else
            System.out.println("checkFind2() is success");               
        if(!Ex14.find(mat2, 49))
            System.out.println("checkFind3() is failed");
        else
            System.out.println("checkFind3() is success");                
        if(!Ex14.find(mat2, 25))
            System.out.println("checkFind4() is failed");
        else
            System.out.println("checkFind4() is success");            
        if(!Ex14.find(mat2, 57))
            System.out.println("checkFind5() is failed");
        else
            System.out.println("checkFind5() is success");            
        if(Ex14.find(mat2, 23))
            System.out.println("checkFind6() is failed");
        else
            System.out.println("checkFind6() is success");                
        if(Ex14.find(mat2, 11))
            System.out.println("checkFind7() is failed");
        else
            System.out.println("checkFind7() is success");
        if(Ex14.find(mat3,577))
            System.out.println("Success, 577 found in mat3");
        else
            System.out.println("failed, 577 wasn't found in mat3");
        if(Ex14.find(mat3,1017))
            System.out.println("Success, 1017 found in mat3");
        else
            System.out.println("failed, 1017 wasn't found in mat3");
        if(Ex14.find(mat3,0))
            System.out.println("Success, 0 found in mat3");
        else
            System.out.println("failed, 0 wasn't found in mat3");
        if(Ex14.find(mat3,341))
            System.out.println("Success, 341 found in mat3");
        else
            System.out.println("failed, 341 wasn't found in mat3");
        if(Ex14.find(mat3,682))
            System.out.println("Success, 682 found in mat3");
        else
            System.out.println("failed, 682 wasn't found in mat3");
        if(Ex14.find(mat3,1023))
            System.out.println("Success, 1023 found in mat3");
        else
            System.out.println("failed, 1023 wasn't found in mat3");
    }

    
    private static void checkIsSink() {
        int[][] mat1 = { //sink=1
                {0, 1},
                {0, 0}};

        int[][] mat2 = { //sink=2
                {0, 1, 1},
                {0, 1, 1},
                {0, 0, 0}};

        if( Ex14.isSink(mat2) != 2)
        {
            System.out.println("Mat 2 failed");
            System.out.println(Ex14.isSink(mat2));
        }
        if(Ex14.isSink(mat1) != 1 || Ex14.isSink(mat2) != 2)
        {
            System.out.println(Ex14.isSink(mat1));
            System.out.println("isSink() is failed");

        }
        System.out.println("OK");
    }

}