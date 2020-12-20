package newFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

        InterModal i1 = new InterModal();
        i1.setCompany("i1");
        i1.setSource("intermodal");
        InterModal i2 = new InterModal();
        i2.setCompany("i2");
        i2.setSource("intermodalll");
        List<InterModal> companySource = new ArrayList<>();
        companySource.add(i1);
        companySource.add(i2);
        Map<String,InterModal> map = companySource.stream().collect(Collectors.toMap(InterModal::getCompany,v -> v));
        List<String> companies = companySource.stream().map(InterModal::getCompany).filter(x -> !Objects.isNull(x)).distinct().collect(Collectors.toList());
//        Map<String,InterModal> map = companySource.stream().filter(x -> "intermodal".equals(x.getSource())).collect(Collectors.toMap(InterModal::getCompany,(v -> v)));
        System.out.println(map.get("i1"));
        System.out.println(map.get("i2"));
    }
}
