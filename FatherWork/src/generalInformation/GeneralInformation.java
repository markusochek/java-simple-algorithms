package generalInformation;

import allEnum.AllEnum.AnalysisStatus;
import allEnum.AllEnum.LoanProgram;
import allEnum.AllEnum.View;
import allEnum.AllEnum.Region;

import javax.xml.crypto.Data;

public class GeneralInformation {
	private String version;
	private Data date;
	
	private AnalysisStatus analysisStatus;
	private LoanProgram loanProgram;
	private View view;
	private Region region;
	private boolean specialProgramForMedicalWorkers;
}
