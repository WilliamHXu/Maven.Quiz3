package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private Map<Lab, LabStatus> labMap;

    public Student() {
        this(new TreeMap<>());
    }

    public Student(Map<Lab, LabStatus> map) {
        this.labMap = map;
    }

    public Lab getLab(String labName) {
        Lab result = null;
        Set<Lab> labs = labMap.keySet();
        for (Lab lab : labs){
            if (labName.equals(lab.getName())){
                result = lab;
                break;
            }
        }
        return result;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (getLab(labName) != null) {
            labMap.put(getLab(labName), labStatus);
        }
        else{
            throw new UnsupportedOperationException();
        }
    }


    public void forkLab(Lab lab) {
        labMap.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        LabStatus result = null;
        Set<Lab> labs = labMap.keySet();
        for (Lab lab : labs){
            if (labName.equals(lab.getName())){
                result = labMap.get(lab);
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        Set<Lab> labs = labMap.keySet();
        Lab[] labArray = labs.toArray(new Lab[0]);
        for (int i = 0; i < labArray.length; i++){
            Lab lab = labArray[i];
            result += lab.getName() + " > " + labMap.get(lab).toString();
            if (i != labArray.length - 1){
                result += "\n";
            }
        }
        return result;
    }
}
