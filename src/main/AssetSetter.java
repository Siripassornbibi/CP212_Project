package main;

import object.*;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	public void setObject() {
		
		gp.obj[0] = new OBJ_Spray();
		gp.obj[0].worldX = 11 * gp.tileSize;
		gp.obj[0].worldY = 18 * gp.tileSize;
		
		gp.obj[1] = new OBJ_ArmchairR();
		gp.obj[1].worldX = 25  * gp.tileSize;
		gp.obj[1].worldY = 6 * gp.tileSize;
		
		gp.obj[2] = new OBJ_ArmchairF();
		gp.obj[2].worldX = 13 * gp.tileSize;
		gp.obj[2].worldY = 3 * gp.tileSize;
		
		gp.obj[3] = new OBJ_ArmchairF();
		gp.obj[3].worldX = 18 * gp.tileSize;
		gp.obj[3].worldY = 19 * gp.tileSize;
		
		gp.obj[4] = new OBJ_Shelf();
		gp.obj[4].worldX = 15 * gp.tileSize;
		gp.obj[4].worldY = 17 * gp.tileSize;
		
		gp.obj[5] = new OBJ_Shelf();
		gp.obj[5].worldX = 18 * gp.tileSize;
		gp.obj[5].worldY = 17 * gp.tileSize;
		
		gp.obj[6] = new OBJ_Shelf2();
		gp.obj[6].worldX = 16 * gp.tileSize;
		gp.obj[6].worldY = 17 * gp.tileSize;
		
		gp.obj[7] = new OBJ_Shelf2();
		gp.obj[7].worldX = 17 * gp.tileSize;
		gp.obj[7].worldY = 17 * gp.tileSize;
		
		gp.obj[8] = new OBJ_Tree1();
		gp.obj[8].worldX = 26 * gp.tileSize;
		gp.obj[8].worldY = 9 * gp.tileSize;
		
		gp.obj[9] = new OBJ_ToiletUnder();
		gp.obj[9].worldX = 1 * gp.tileSize;
		gp.obj[9].worldY = 3 * gp.tileSize;
		
		gp.obj[10] = new OBJ_ToiletTop();
		gp.obj[10].worldX = 1 * gp.tileSize;
		gp.obj[10].worldY = 2 * gp.tileSize;
		
		gp.obj[11] = new OBJ_ToiletTop();
		gp.obj[11].worldX = 5 * gp.tileSize;
		gp.obj[11].worldY = 2 * gp.tileSize;
		
		gp.obj[12] = new OBJ_ToiletTop();
		gp.obj[12].worldX = 9 * gp.tileSize;
		gp.obj[12].worldY = 2 * gp.tileSize;
		
		gp.obj[13] = new OBJ_ToiletUnder();
		gp.obj[13].worldX = 5 * gp.tileSize;
		gp.obj[13].worldY = 3 * gp.tileSize;
		
		gp.obj[14] = new OBJ_ToiletUnder();
		gp.obj[14].worldX = 9 * gp.tileSize;
		gp.obj[14].worldY = 3 * gp.tileSize;
		
		gp.obj[15] = new OBJ_Sink1L();
		gp.obj[15].worldX = 2 * gp.tileSize;
		gp.obj[15].worldY = 9 * gp.tileSize;
		
		gp.obj[16] = new OBJ_Sink1R();
		gp.obj[16].worldX = 3 * gp.tileSize;
		gp.obj[16].worldY = 9 * gp.tileSize;
		
		gp.obj[17] = new OBJ_Sink2L();
		gp.obj[17].worldX = 8 * gp.tileSize;
		gp.obj[17].worldY = 9 * gp.tileSize;
		
		gp.obj[18] = new OBJ_Sink2R();
		gp.obj[18].worldX = 9 * gp.tileSize;
		gp.obj[18].worldY = 9 * gp.tileSize;
		
		gp.obj[19] = new OBJ_Tree1();
		gp.obj[19].worldX = 10 * gp.tileSize;
		gp.obj[19].worldY = 9 * gp.tileSize;
		
		gp.obj[20] = new OBJ_Tree4();
		gp.obj[20].worldX = 1 * gp.tileSize;
		gp.obj[20].worldY = 9 * gp.tileSize;
		
		gp.obj[21] = new OBJ_Tissues();
		gp.obj[21].worldX = 6 * gp.tileSize;
		gp.obj[21].worldY = 2 * gp.tileSize;
		
		gp.obj[22] = new OBJ_Tissues();
		gp.obj[22].worldX = 2 * gp.tileSize;
		gp.obj[22].worldY = 2 * gp.tileSize;
		
		gp.obj[23] = new OBJ_Tissues();
		gp.obj[23].worldX = 10 * gp.tileSize;
		gp.obj[23].worldY = 2 * gp.tileSize;
		
		gp.obj[24] = new OBJ_HalfWall1();
		gp.obj[24].worldX = 2 * gp.tileSize;
		gp.obj[24].worldY = 4 * gp.tileSize;
		
		gp.obj[25] = new OBJ_HalfWall1();
		gp.obj[25].worldX = 4 * gp.tileSize;
		gp.obj[25].worldY = 4 * gp.tileSize;
		
		gp.obj[50] = new OBJ_HalfWall1();
		gp.obj[50].worldX = 8 * gp.tileSize;
		gp.obj[50].worldY = 4 * gp.tileSize;
		
		gp.obj[26] = new OBJ_ChairP();
		gp.obj[26].worldX = 21 * gp.tileSize;
		gp.obj[26].worldY = 30 * gp.tileSize;
		
		gp.obj[27] = new OBJ_ChairP();
		gp.obj[27].worldX = 21 * gp.tileSize;
		gp.obj[27].worldY = 28 * gp.tileSize;
		
		gp.obj[28] = new OBJ_ChairP();
		gp.obj[28].worldX = 11 * gp.tileSize;
		gp.obj[28].worldY = 30 * gp.tileSize;
		
		gp.obj[29] = new OBJ_ChairP();
		gp.obj[29].worldX = 11 * gp.tileSize;
		gp.obj[29].worldY = 28 * gp.tileSize;
		
		gp.obj[30] = new OBJ_ChairG();
		gp.obj[30].worldX = 22 * gp.tileSize;
		gp.obj[30].worldY = 30 * gp.tileSize;
		
		gp.obj[31] = new OBJ_ChairG();
		gp.obj[31].worldX = 22 * gp.tileSize;
		gp.obj[31].worldY = 28 * gp.tileSize;
		
		gp.obj[32] = new OBJ_ChairG();
		gp.obj[32].worldX = 12 * gp.tileSize;
		gp.obj[32].worldY = 30 * gp.tileSize;
		
		gp.obj[33] = new OBJ_ChairG();
		gp.obj[33].worldX = 12 * gp.tileSize;
		gp.obj[33].worldY = 28 * gp.tileSize;
		
		gp.obj[34] = new OBJ_BedG_T();
		gp.obj[34].worldX = 15 * gp.tileSize;
		gp.obj[34].worldY = 3 * gp.tileSize;
		
		gp.obj[35] = new OBJ_BedG_U();
		gp.obj[35].worldX = 15 * gp.tileSize;
		gp.obj[35].worldY = 4 * gp.tileSize;
		
		gp.obj[36] = new OBJ_BedG_T();
		gp.obj[36].worldX = 12 * gp.tileSize;
		gp.obj[36].worldY = 3 * gp.tileSize;
		
		gp.obj[37] = new OBJ_BedG_U();
		gp.obj[37].worldX = 12 * gp.tileSize;
		gp.obj[37].worldY = 4 * gp.tileSize;
		
		gp.obj[38] = new OBJ_BedP_T();
		gp.obj[38].worldX = 23 * gp.tileSize;
		gp.obj[38].worldY = 3 * gp.tileSize;
		
		gp.obj[39] = new OBJ_BedP_U();
		gp.obj[39].worldX = 23 * gp.tileSize;
		gp.obj[39].worldY = 4 * gp.tileSize;
		
		gp.obj[40] = new OBJ_BedP_T();
		gp.obj[40].worldX = 25 * gp.tileSize;
		gp.obj[40].worldY = 3 * gp.tileSize;
		
		gp.obj[41] = new OBJ_BedP_U();
		gp.obj[41].worldX = 25 * gp.tileSize;
		gp.obj[41].worldY = 4 * gp.tileSize;
		
		gp.obj[42] = new OBJ_BedP_T();
		gp.obj[42].worldX = 26 * gp.tileSize;
		gp.obj[42].worldY = 3 * gp.tileSize;
		
		gp.obj[43] = new OBJ_BedP_U();
		gp.obj[43].worldX = 26 * gp.tileSize;
		gp.obj[43].worldY = 4 * gp.tileSize;
		
		gp.obj[44] = new OBJ_BedsideTable1();
		gp.obj[44].worldX = 24 * gp.tileSize;
		gp.obj[44].worldY = 3 * gp.tileSize;
		
		gp.obj[45] = new OBJ_BedsideTable2();
		gp.obj[45].worldX = 14 * gp.tileSize;
		gp.obj[45].worldY = 3 * gp.tileSize;
		
		gp.obj[46] = new OBJ_Bigbogshelf3_TL();
		gp.obj[46].worldX = 9 * gp.tileSize;
		gp.obj[46].worldY = 12 * gp.tileSize;
		
		gp.obj[47] = new OBJ_Bigbogshelf3_TR();
		gp.obj[47].worldX = 10 * gp.tileSize;
		gp.obj[47].worldY = 12 * gp.tileSize;
		
		gp.obj[48] = new OBJ_Bigbogshelf3_UL();
		gp.obj[48].worldX = 9 * gp.tileSize;
		gp.obj[48].worldY = 13 * gp.tileSize;
		
		gp.obj[49] = new OBJ_Bigbogshelf3_UR();
		gp.obj[49].worldX = 10 * gp.tileSize;
		gp.obj[49].worldY = 13 * gp.tileSize;
		
		gp.obj[51] = new OBJ_Bigbogshelf3_TL();
		gp.obj[51].worldX = 29 * gp.tileSize;
		gp.obj[51].worldY = 16 * gp.tileSize;
		
		gp.obj[52] = new OBJ_Bigbogshelf3_TR();
		gp.obj[52].worldX = 30 * gp.tileSize;
		gp.obj[52].worldY = 16 * gp.tileSize;
		
		gp.obj[53] = new OBJ_Bigbogshelf3_UL();
		gp.obj[53].worldX = 29 * gp.tileSize;
		gp.obj[53].worldY = 17 * gp.tileSize;
		
		gp.obj[54] = new OBJ_Bigbogshelf3_UR();
		gp.obj[54].worldX = 30 * gp.tileSize;
		gp.obj[54].worldY = 17 * gp.tileSize;
		
		gp.obj[55] = new OBJ_Bigbogshelf3_TL();
		gp.obj[55].worldX = 1 * gp.tileSize;
		gp.obj[55].worldY = 12 * gp.tileSize;
		
		gp.obj[56] = new OBJ_Bigbogshelf3_TR();
		gp.obj[56].worldX = 2 * gp.tileSize;
		gp.obj[56].worldY = 12 * gp.tileSize;
		
		gp.obj[57] = new OBJ_Bigbogshelf3_UL();
		gp.obj[57].worldX = 1 * gp.tileSize;
		gp.obj[57].worldY = 13 * gp.tileSize;
		
		gp.obj[58] = new OBJ_Bigbogshelf3_UR();
		gp.obj[58].worldX = 2 * gp.tileSize;
		gp.obj[58].worldY = 13 * gp.tileSize;
		
		gp.obj[59] = new OBJ_Bigbogshelf3_TL();
		gp.obj[59].worldX = 12 * gp.tileSize;
		gp.obj[59].worldY = 8 * gp.tileSize;
		
		gp.obj[60] = new OBJ_Bigbogshelf3_TR();
		gp.obj[60].worldX = 13 * gp.tileSize;
		gp.obj[60].worldY = 8 * gp.tileSize;
		
		gp.obj[61] = new OBJ_Bigbogshelf3_UL();
		gp.obj[61].worldX = 12 * gp.tileSize;
		gp.obj[61].worldY = 9 * gp.tileSize;
		
		gp.obj[62] = new OBJ_Bigbogshelf3_UR();
		gp.obj[62].worldX = 13 * gp.tileSize;
		gp.obj[62].worldY = 9 * gp.tileSize;
		
		gp.obj[63] = new OBJ_Bigbogshelf3_TL();
		gp.obj[63].worldX = 24 * gp.tileSize;
		gp.obj[63].worldY = 8 * gp.tileSize;
		
		gp.obj[64] = new OBJ_Bigbogshelf3_TR();
		gp.obj[64].worldX = 25 * gp.tileSize;
		gp.obj[64].worldY = 8 * gp.tileSize;
		
		gp.obj[65] = new OBJ_Bigbogshelf3_UL();
		gp.obj[65].worldX = 24 * gp.tileSize;
		gp.obj[65].worldY = 9 * gp.tileSize;
		
		gp.obj[66] = new OBJ_Bigbogshelf3_UR();
		gp.obj[66].worldX = 25 * gp.tileSize;
		gp.obj[66].worldY = 9 * gp.tileSize;
		
		gp.obj[67] = new OBJ_Tree3T();
		gp.obj[67].worldX = 8 * gp.tileSize;
		gp.obj[67].worldY = 12 * gp.tileSize;
		
		gp.obj[68] = new OBJ_Tree3U();
		gp.obj[68].worldX = 8 * gp.tileSize;
		gp.obj[68].worldY = 13 * gp.tileSize;
		
		gp.obj[69] = new OBJ_Tree3T();
		gp.obj[69].worldX = 23 * gp.tileSize;
		gp.obj[69].worldY = 8 * gp.tileSize;
		
		gp.obj[70] = new OBJ_Tree3U();
		gp.obj[70].worldX = 23 * gp.tileSize;
		gp.obj[70].worldY = 9 * gp.tileSize;
		
		gp.obj[71] = new OBJ_Tree3T();
		gp.obj[71].worldX = 31 * gp.tileSize;
		gp.obj[71].worldY = 8 * gp.tileSize;
		
		gp.obj[72] = new OBJ_Tree3U();
		gp.obj[72].worldX = 31 * gp.tileSize;
		gp.obj[72].worldY = 9 * gp.tileSize;
		
		gp.obj[73] = new OBJ_Tree3T();
		gp.obj[73].worldX = 32 * gp.tileSize;
		gp.obj[73].worldY = 16 * gp.tileSize;
		
		gp.obj[74] = new OBJ_Tree3U();
		gp.obj[74].worldX = 32 * gp.tileSize;
		gp.obj[74].worldY = 17 * gp.tileSize;
		
		gp.obj[75] = new OBJ_Tree3T();
		gp.obj[75].worldX = 32 * gp.tileSize;
		gp.obj[75].worldY = 25 * gp.tileSize;
		
		gp.obj[76] = new OBJ_Tree3U();
		gp.obj[76].worldX = 32 * gp.tileSize;
		gp.obj[76].worldY = 26 * gp.tileSize;
		
		gp.obj[77] = new OBJ_Tree3T();
		gp.obj[77].worldX = 1 * gp.tileSize;
		gp.obj[77].worldY = 25 * gp.tileSize;
		
		gp.obj[78] = new OBJ_Tree3U();
		gp.obj[78].worldX = 1 * gp.tileSize;
		gp.obj[78].worldY = 26 * gp.tileSize;
		
		gp.obj[79] = new OBJ_Tree3T();
		gp.obj[79].worldX = 23 * gp.tileSize;
		gp.obj[79].worldY = 16 * gp.tileSize;
		
		gp.obj[80] = new OBJ_Tree3U();
		gp.obj[80].worldX = 23 * gp.tileSize;
		gp.obj[80].worldY = 17 * gp.tileSize;
		
		gp.obj[81] = new OBJ_RubbishbinO();
		gp.obj[81].worldX = 12 * gp.tileSize;
		gp.obj[81].worldY = 13 * gp.tileSize;
		
		gp.obj[82] = new OBJ_RubbishbinO();
		gp.obj[82].worldX = 32 * gp.tileSize;
		gp.obj[82].worldY = 13 * gp.tileSize;
		
		gp.obj[83] = new OBJ_RubbishbinG();
		gp.obj[83].worldX = 4 * gp.tileSize;
		gp.obj[83].worldY = 3 * gp.tileSize;
		
		gp.obj[84] = new OBJ_RubbishbinG();
		gp.obj[84].worldX = 8 * gp.tileSize;
		gp.obj[84].worldY = 3 * gp.tileSize;
		
		gp.obj[85] = new OBJ_RubbishbinP();
		gp.obj[85].worldX = 1 * gp.tileSize;
		gp.obj[85].worldY = 22 * gp.tileSize;
		
		gp.obj[86] = new OBJ_RubbishbinP();
		gp.obj[86].worldX = 1 * gp.tileSize;
		gp.obj[86].worldY = 31 * gp.tileSize;
		
		gp.obj[87] = new OBJ_RubbishbinP();
		gp.obj[87].worldX = 32 * gp.tileSize;
		gp.obj[87].worldY = 22 * gp.tileSize;
		
		gp.obj[88] = new OBJ_RubbishbinP();
		gp.obj[88].worldX = 32 * gp.tileSize;
		gp.obj[88].worldY = 31 * gp.tileSize;
		
		gp.obj[89] = new OBJ_ShelfTop1();
		gp.obj[89].worldX = 32 * gp.tileSize;
		gp.obj[89].worldY = 8 * gp.tileSize;
		
		gp.obj[90] = new OBJ_ShelfUnder1();
		gp.obj[90].worldX = 32 * gp.tileSize;
		gp.obj[90].worldY = 9 * gp.tileSize;
		
		gp.obj[91] = new OBJ_ShelfTop2();
		gp.obj[91].worldX = 28 * gp.tileSize;
		gp.obj[91].worldY = 8 * gp.tileSize;
		
		gp.obj[92] = new OBJ_ShelfUnder2();
		gp.obj[92].worldX = 28 * gp.tileSize;
		gp.obj[92].worldY = 9 * gp.tileSize;
		
		gp.obj[93] = new OBJ_ShelfTop2();
		gp.obj[93].worldX = 27 * gp.tileSize;
		gp.obj[93].worldY = 8 * gp.tileSize;
		
		gp.obj[94] = new OBJ_ShelfUnder1();
		gp.obj[94].worldX = 27 * gp.tileSize;
		gp.obj[94].worldY = 9 * gp.tileSize;
		
		gp.obj[95] = new OBJ_ShelfTop1();
		gp.obj[95].worldX = 20 * gp.tileSize;
		gp.obj[95].worldY = 16 * gp.tileSize;
		
		gp.obj[96] = new OBJ_ShelfUnder2();
		gp.obj[96].worldX = 20 * gp.tileSize;
		gp.obj[96].worldY = 17 * gp.tileSize;
		
		gp.obj[97] = new OBJ_ShelfTop2();
		gp.obj[97].worldX = 21 * gp.tileSize;
		gp.obj[97].worldY = 16 * gp.tileSize;
		
		gp.obj[98] = new OBJ_ShelfUnder2();
		gp.obj[98].worldX = 21 * gp.tileSize;
		gp.obj[98].worldY = 17 * gp.tileSize;
		
		gp.obj[99] = new OBJ_ShelfTop1();
		gp.obj[99].worldX = 13 * gp.tileSize;
		gp.obj[99].worldY = 16 * gp.tileSize;
		
		gp.obj[100] = new OBJ_ShelfUnder1();
		gp.obj[100].worldX = 13 * gp.tileSize;
		gp.obj[100].worldY = 17 * gp.tileSize;
		
		gp.obj[101] = new OBJ_ShelfTop2();
		gp.obj[101].worldX = 12 * gp.tileSize;
		gp.obj[101].worldY = 16 * gp.tileSize;
		
		gp.obj[102] = new OBJ_ShelfUnder2();
		gp.obj[102].worldX = 12 * gp.tileSize;
		gp.obj[102].worldY = 17 * gp.tileSize;
		
		gp.obj[103] = new OBJ_ArmchairF();
		gp.obj[103].worldX = 15 * gp.tileSize;
		gp.obj[103].worldY = 19 * gp.tileSize;
		
		gp.obj[104] = new OBJ_Tree3T();
		gp.obj[104].worldX = 3 * gp.tileSize;
		gp.obj[104].worldY = 12 * gp.tileSize;
		
		gp.obj[105] = new OBJ_Tree3U();
		gp.obj[105].worldX = 3 * gp.tileSize;
		gp.obj[105].worldY = 13 * gp.tileSize;
		
		gp.obj[106] = new OBJ_Tree4();
		gp.obj[106].worldX = 14 * gp.tileSize;
		gp.obj[106].worldY = 19 * gp.tileSize;
		
		gp.obj[107] = new OBJ_Tree4();
		gp.obj[107].worldX = 19 * gp.tileSize;
		gp.obj[107].worldY = 19 * gp.tileSize;
		
		gp.obj[108] = new OBJ_Tree4();
		gp.obj[108].worldX = 12 * gp.tileSize;
		gp.obj[108].worldY = 6 * gp.tileSize;
		
		gp.obj[109] = new OBJ_ShelfUnder1();
		gp.obj[109].worldX = 19 * gp.tileSize;
		gp.obj[109].worldY = 3 * gp.tileSize;
		
		gp.obj[110] = new OBJ_ShelfTop1();
		gp.obj[110].worldX = 19 * gp.tileSize;
		gp.obj[110].worldY = 2 * gp.tileSize;
		
		gp.obj[111] = new OBJ_ShelfUnder2();
		gp.obj[111].worldX = 18 * gp.tileSize;
		gp.obj[111].worldY = 3 * gp.tileSize;
		
		gp.obj[112] = new OBJ_ShelfTop1();
		gp.obj[112].worldX = 18 * gp.tileSize;
		gp.obj[112].worldY = 2 * gp.tileSize;
		
		gp.obj[113] = new OBJ_ShelfUnder1();
		gp.obj[113].worldX = 17 * gp.tileSize;
		gp.obj[113].worldY = 3 * gp.tileSize;
		
		gp.obj[114] = new OBJ_ShelfTop1();
		gp.obj[114].worldX = 17 * gp.tileSize;
		gp.obj[114].worldY = 2 * gp.tileSize;
		
		gp.obj[115] = new OBJ_ChairlongRG();
		gp.obj[115].worldX = 3 * gp.tileSize;
		gp.obj[115].worldY = 7 * gp.tileSize;
		
		gp.obj[116] = new OBJ_ChairlongLG();
		gp.obj[116].worldX = 2 * gp.tileSize;
		gp.obj[116].worldY = 7 * gp.tileSize;
		
		gp.obj[117] = new OBJ_ChairlongRP();
		gp.obj[117].worldX = 3 * gp.tileSize;
		gp.obj[117].worldY = 15 * gp.tileSize;
		
		gp.obj[118] = new OBJ_ChairlongLP();
		gp.obj[118].worldX = 2 * gp.tileSize;
		gp.obj[118].worldY = 15 * gp.tileSize;
		
		gp.obj[119] = new OBJ_ChairlongRP();
		gp.obj[119].worldX = 3 * gp.tileSize;
		gp.obj[119].worldY = 17 * gp.tileSize;
		
		gp.obj[120] = new OBJ_ChairlongLP();
		gp.obj[120].worldX = 2 * gp.tileSize;
		gp.obj[120].worldY = 17 * gp.tileSize;
		
		gp.obj[121] = new OBJ_TableL();
		gp.obj[121].worldX = 2 * gp.tileSize;
		gp.obj[121].worldY = 16 * gp.tileSize;
		
		gp.obj[122] = new OBJ_TableR();
		gp.obj[122].worldX = 3 * gp.tileSize;
		gp.obj[122].worldY = 16 * gp.tileSize;
		
		gp.obj[123] = new OBJ_TableL();
		gp.obj[123].worldX = 23 * gp.tileSize;
		gp.obj[123].worldY = 6 * gp.tileSize;
		
		gp.obj[124] = new OBJ_TableR();
		gp.obj[124].worldX = 24 * gp.tileSize;
		gp.obj[124].worldY = 6 * gp.tileSize;
		
		gp.obj[125] = new OBJ_BedsideTable2();
		gp.obj[125].worldX = 4 * gp.tileSize;
		gp.obj[125].worldY = 7 * gp.tileSize;
		
		gp.obj[126] = new OBJ_BedsideTable1();
		gp.obj[126].worldX = 7 * gp.tileSize;
		gp.obj[126].worldY = 7 * gp.tileSize;
		
		gp.obj[127] = new OBJ_TableL();
		gp.obj[127].worldX = 17 * gp.tileSize;
		gp.obj[127].worldY = 5 * gp.tileSize;
		
		gp.obj[128] = new OBJ_TableR();
		gp.obj[128].worldX = 18 * gp.tileSize;
		gp.obj[128].worldY = 5 * gp.tileSize;
		
		gp.obj[129] = new OBJ_Tree1();
		gp.obj[129].worldX = 17 * gp.tileSize;
		gp.obj[129].worldY = 5 * gp.tileSize;
		
		gp.obj[130] = new OBJ_Chair();
		gp.obj[130].worldX = 17 * gp.tileSize;
		gp.obj[130].worldY = 4 * gp.tileSize;
		
		gp.obj[131] = new OBJ_Tree3T();
		gp.obj[131].worldX = 14 * gp.tileSize;
		gp.obj[131].worldY = 8 * gp.tileSize;
		
		gp.obj[132] = new OBJ_Tree3U();
		gp.obj[132].worldX = 14 * gp.tileSize;
		gp.obj[132].worldY = 9 * gp.tileSize;
		
		gp.obj[133] = new OBJ_ChairP();
		gp.obj[133].worldX = 12 * gp.tileSize;
		gp.obj[133].worldY = 11 * gp.tileSize;
		
		gp.obj[134] = new OBJ_ChairG();
		gp.obj[134].worldX = 12 * gp.tileSize;
		gp.obj[134].worldY = 12 * gp.tileSize;
		
		gp.obj[135] = new OBJ_TableL();
		gp.obj[135].worldX = 29 * gp.tileSize;
		gp.obj[135].worldY = 20 * gp.tileSize;
		
		gp.obj[136] = new OBJ_TableR();
		gp.obj[136].worldX = 30 * gp.tileSize;
		gp.obj[136].worldY = 20 * gp.tileSize;
		
		gp.obj[137] = new OBJ_ChairlongLG();
		gp.obj[137].worldX = 29 * gp.tileSize;
		gp.obj[137].worldY = 19 * gp.tileSize;
		
		gp.obj[138] = new OBJ_ChairlongRG();
		gp.obj[138].worldX = 30 * gp.tileSize;
		gp.obj[138].worldY = 19 * gp.tileSize;
		
		gp.obj[139] = new OBJ_ChairlongLG();
		gp.obj[139].worldX = 29 * gp.tileSize;
		gp.obj[139].worldY = 21 * gp.tileSize;
		
		gp.obj[140] = new OBJ_ChairlongRG();
		gp.obj[140].worldX = 30 * gp.tileSize;
		gp.obj[140].worldY = 21 * gp.tileSize;
		
		gp.obj[141] = new OBJ_Tree4();
		gp.obj[141].worldX = 28 * gp.tileSize;
		gp.obj[141].worldY = 17 * gp.tileSize;
		
		gp.obj[142] = new OBJ_ChairlongLG();
		gp.obj[142].worldX = 23 * gp.tileSize;
		gp.obj[142].worldY = 13 * gp.tileSize;
		
		gp.obj[143] = new OBJ_ChairlongRG();
		gp.obj[143].worldX = 24 * gp.tileSize;
		gp.obj[143].worldY = 13 * gp.tileSize;
		
		gp.obj[144] = new OBJ_ChairlongLP();
		gp.obj[144].worldX = 20 * gp.tileSize;
		gp.obj[144].worldY = 13 * gp.tileSize;
		
		gp.obj[145] = new OBJ_ChairlongRP();
		gp.obj[145].worldX = 21 * gp.tileSize;
		gp.obj[145].worldY = 13 * gp.tileSize;
		
		gp.obj[146] = new OBJ_BedsideTable2();
		gp.obj[146].worldX = 31 * gp.tileSize;
		gp.obj[146].worldY = 17 * gp.tileSize;
		
		gp.obj[147] = new OBJ_FloorLampT();
		gp.obj[147].worldX = 21 * gp.tileSize;
		gp.obj[147].worldY = 2 * gp.tileSize;
		
		gp.obj[148] = new OBJ_FloorLampU();
		gp.obj[148].worldX = 21 * gp.tileSize;
		gp.obj[148].worldY = 3 * gp.tileSize;
		
		gp.obj[149] = new OBJ_FloorLampT();
		gp.obj[149].worldX = 8 * gp.tileSize;
		gp.obj[149].worldY = 6 * gp.tileSize;
		
		gp.obj[150] = new OBJ_FloorLampU();
		gp.obj[150].worldX = 8 * gp.tileSize;
		gp.obj[150].worldY = 7 * gp.tileSize;
		
		gp.obj[151] = new OBJ_Picture4();
		gp.obj[151].worldX = 3 * gp.tileSize;
		gp.obj[151].worldY = 5 * gp.tileSize;
		
		gp.obj[152] = new OBJ_Picture2();
		gp.obj[152].worldX = 15 * gp.tileSize;
		gp.obj[152].worldY = 15 * gp.tileSize;
		
		gp.obj[153] = new OBJ_Picture2();
		gp.obj[153].worldX = 18 * gp.tileSize;
		gp.obj[153].worldY = 15 * gp.tileSize;
		
		gp.obj[154] = new OBJ_Picture3();
		gp.obj[154].worldX = 15 * gp.tileSize;
		gp.obj[154].worldY = 1 * gp.tileSize;
		
		gp.obj[155] = new OBJ_Picture1();
		gp.obj[155].worldX = 12 * gp.tileSize;
		gp.obj[155].worldY = 1 * gp.tileSize;
		
		gp.obj[156] = new OBJ_Picture2();
		gp.obj[156].worldX = 22 * gp.tileSize;
		gp.obj[156].worldY = 1 * gp.tileSize;
		
		gp.obj[157] = new OBJ_Picture4();
		gp.obj[157].worldX = 24 * gp.tileSize;
		gp.obj[157].worldY = 1 * gp.tileSize;
		
		gp.obj[158] = new OBJ_Mask();
		gp.obj[158].worldX = 18 * gp.tileSize;
		gp.obj[158].worldY = 5 * gp.tileSize;
		
		gp.obj[159] = new OBJ_Pill();
		gp.obj[159].worldX = 30 * gp.tileSize;
		gp.obj[159].worldY = 31 * gp.tileSize;
		
		gp.obj[160] = new OBJ_Vaccine();
		gp.obj[160].worldX = 18 * gp.tileSize;
		gp.obj[160].worldY = 17 * gp.tileSize;
		
		gp.obj[161] = new OBJ_Lifttopleft();
		gp.obj[161].worldX = 29 * gp.tileSize;
		gp.obj[161].worldY = 7 * gp.tileSize;
		
		gp.obj[162] = new OBJ_Lifttopright();
		gp.obj[162].worldX = 30 * gp.tileSize;
		gp.obj[162].worldY = 7 * gp.tileSize;
		
		gp.obj[163] = new OBJ_Liftlowleft();
		gp.obj[163].worldX = 29 * gp.tileSize;
		gp.obj[163].worldY = 8 * gp.tileSize;
		
		gp.obj[164] = new OBJ_Liftlowright();
		gp.obj[164].worldX = 30 * gp.tileSize;
		gp.obj[164].worldY = 8 * gp.tileSize;
		
		gp.obj[165] = new OBJ_Keycard();
		gp.obj[165].worldX = 2 * gp.tileSize;
		gp.obj[165].worldY = 4 * gp.tileSize;
		
		gp.obj[166] = new OBJ_ChairP();
		gp.obj[166].worldX = 25 * gp.tileSize;
		gp.obj[166].worldY = 30 * gp.tileSize;
		
		gp.obj[167] = new OBJ_ChairP();
		gp.obj[167].worldX = 25 * gp.tileSize;
		gp.obj[167].worldY = 28 * gp.tileSize;
		
		gp.obj[168] = new OBJ_ChairP();
		gp.obj[168].worldX = 7 * gp.tileSize;
		gp.obj[168].worldY = 30 * gp.tileSize;
		
		gp.obj[169] = new OBJ_ChairP();
		gp.obj[169].worldX = 7 * gp.tileSize;
		gp.obj[169].worldY = 28 * gp.tileSize;
		
		gp.obj[170] = new OBJ_ChairG();
		gp.obj[170].worldX = 26 * gp.tileSize;
		gp.obj[170].worldY = 30 * gp.tileSize;
		
		gp.obj[171] = new OBJ_ChairG();
		gp.obj[171].worldX = 26 * gp.tileSize;
		gp.obj[171].worldY = 28 * gp.tileSize;
		
		gp.obj[172] = new OBJ_ChairG();
		gp.obj[172].worldX = 8 * gp.tileSize;
		gp.obj[172].worldY = 30 * gp.tileSize;
		
		gp.obj[173] = new OBJ_ChairG();
		gp.obj[173].worldX = 8 * gp.tileSize;
		gp.obj[173].worldY = 28 * gp.tileSize;
		
		gp.obj[174] = new OBJ_ChairP();
		gp.obj[174].worldX = 29 * gp.tileSize;
		gp.obj[174].worldY = 30 * gp.tileSize;
		
		gp.obj[175] = new OBJ_ChairP();
		gp.obj[175].worldX = 29 * gp.tileSize;
		gp.obj[175].worldY = 28 * gp.tileSize;
		
		gp.obj[176] = new OBJ_ChairP();
		gp.obj[176].worldX = 3 * gp.tileSize;
		gp.obj[176].worldY = 30 * gp.tileSize;
		
		gp.obj[177] = new OBJ_ChairP();
		gp.obj[177].worldX = 3 * gp.tileSize;
		gp.obj[177].worldY = 28 * gp.tileSize;
		
		gp.obj[178] = new OBJ_ChairG();
		gp.obj[178].worldX = 30 * gp.tileSize;
		gp.obj[178].worldY = 30 * gp.tileSize;
		
		gp.obj[179] = new OBJ_ChairG();
		gp.obj[179].worldX = 30 * gp.tileSize;
		gp.obj[179].worldY = 28 * gp.tileSize;
		
		gp.obj[180] = new OBJ_ChairG();
		gp.obj[180].worldX = 4 * gp.tileSize;
		gp.obj[180].worldY = 30 * gp.tileSize;
		
		gp.obj[181] = new OBJ_ChairG();
		gp.obj[181].worldX = 4 * gp.tileSize;
		gp.obj[181].worldY = 28 * gp.tileSize;
		
		gp.obj[182] = new OBJ_Irondoor();
		gp.obj[182].worldX = 19 * gp.tileSize;
		gp.obj[182].worldY = 15 * gp.tileSize;
		
		gp.obj[183] = new OBJ_Irondoor();
		gp.obj[183].worldX = 14 * gp.tileSize;
		gp.obj[183].worldY = 15 * gp.tileSize;
		
		gp.obj[184] = new OBJ_Virus();
		gp.obj[184].worldX = 5 * gp.tileSize;
		gp.obj[184].worldY = 12 * gp.tileSize;
		
		gp.obj[185] = new OBJ_Virus();
		gp.obj[185].worldX = 6 * gp.tileSize;
		gp.obj[185].worldY = 12 * gp.tileSize;
		
		
	
	}
}
