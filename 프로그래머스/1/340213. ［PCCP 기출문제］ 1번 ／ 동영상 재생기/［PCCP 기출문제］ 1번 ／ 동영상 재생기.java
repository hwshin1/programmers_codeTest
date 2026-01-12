class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int video_lenSec = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3));
        int posSec = Integer.parseInt(pos.substring(0,2)) * 60 + Integer.parseInt(pos.substring(3));
        int opStartSec = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3));
        int opEndSec = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3));

        if (posSec >= opStartSec && posSec <= opEndSec) {
            posSec = opEndSec;
        }

        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];

            if (command.equals("next")) {
                posSec = posSec + 10;
                if (posSec > video_lenSec) {
                    posSec = video_lenSec;
                }
            } else {
                posSec = posSec - 10;
                if (posSec < 0) {
                    posSec = 0;
                }
            }

            // 이동 후에도 오프닝 구간이면 점프?
            if (posSec >= opStartSec && posSec <= opEndSec) {
                posSec = opEndSec;
            }

            int mm = posSec / 60;
            int ss = posSec % 60;

            String mmStr = (mm < 10) ? "0" + mm : String.valueOf(mm);
            String ssStr = (ss < 10) ? "0" + ss : String.valueOf(ss);

            answer = mmStr + ":" + ssStr;
        }
        
        return answer;
    }
}