//package gr.aueb.cf.ch17.threads;
//
//public class Knight implements IKnight{
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void embarkOnMission(IMission mission) {
//        System.out.println("Knight name: " + name);
//        mission.setMissionStatus(MissionStatus.STARTED);
//        mission.embark();
//    }
//
//    @Override
//    public void run() {
//
//        synchronized (IKnight.missions) {
//
//        }
//
//        for (IMission mission: IKnight.missions) {
//            if (mission.getMissionStatus() == MissionStatus.NOT_STARTED) {
//                embarkOnMission(mission);
//                break;
//            }
//        }
//    }
//}
