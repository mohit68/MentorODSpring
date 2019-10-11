package com.iiht.caseStudy4gateway;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.iiht.model.MentorSkills;
import com.iiht.model.SearchResultList;
import com.iiht.model.SkillDtls;
import com.iiht.model.User;


@Component
public class CaseStudy4Component {
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	DiscoveryClient discoveryClient;

	public List<User> getAllUser() throws URISyntaxException {
		System.out.println("1");
		List<ServiceInstance> otherInstance = discoveryClient.getInstances("caseStudy4-user");
		System.out.println("instance found" + otherInstance);
		if (null == otherInstance) {
			System.out.println("null");
			return null;
		} else {
			ServiceInstance instance = otherInstance.get(0);
			final String baseUrl = "http://" + instance.getHost() + ":" + instance.getPort() + "/user";
			URI uri = new URI(baseUrl);
			System.out.println(uri);

			// ResponseEntity<String> result = restTemplate.getForEntity(uri,
			// String.class);
			// return result.getBody().toString();

			ResponseEntity<List<User>> response = restTemplate.exchange(uri, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<User>>() {
					});
			return (List<User>) response.getBody();

		}
	}

	
	public List<List> getAllSerachResult() throws URISyntaxException {
		System.out.println("1");
		List<ServiceInstance> otherInstance = discoveryClient.getInstances("caseStudy4-SkillDtls");
		List<ServiceInstance> otherInstance1 = discoveryClient.getInstances("caseStudy4-MentorSkill");
		System.out.println("instance found" + otherInstance);
		if (null == otherInstance || null == otherInstance1) {
			System.out.println("null");
			return null;
		} else {
			ServiceInstance instance = otherInstance.get(0);
			final String baseUrl = "http://" + instance.getHost() + ":" + instance.getPort() + "/skill";
			URI uri = new URI(baseUrl);

			ServiceInstance instance1 = otherInstance1.get(0);
			final String baseUrl1 = "http://" + instance1.getHost() + ":" + instance1.getPort() + "/skillSet";
			URI uri1 = new URI(baseUrl1);

			System.out.println(uri);

			// ResponseEntity<String> result = restTemplate.getForEntity(uri,
			// String.class);
			//
			//
			// ResponseEntity<String> result1 = restTemplate.getForEntity(uri1,
			// String.class);
			//
			// return
			// result.getBody().toString()+"\n"+result1.getBody().toString();

			ResponseEntity<List<SkillDtls>> response = restTemplate.exchange(uri, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<SkillDtls>>() {
					});

			ResponseEntity<List<MentorSkills>> response1 = restTemplate.exchange(uri1, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<MentorSkills>>() {
					});
			SearchResultList a = new SearchResultList();

			List<List> aList = new ArrayList<List>();
			aList.add(response.getBody());
			aList.add(response1.getBody());
			response.getBody().get(0);
			return aList;

			// return (List<SearchResultList>) response.getBody();

		}
	}

	
	
	/*public List<List> getSerachResult(String search) throws URISyntaxException {
		System.out.println("1");
		List<ServiceInstance> otherInstance = discoveryClient.getInstances("caseStudy4-SkillDtls");
		List<ServiceInstance> otherInstance1 = discoveryClient.getInstances("caseStudy4-MentorSkill");
		System.out.println("instance found" + otherInstance);
		if (null == otherInstance || null == otherInstance1) {
			System.out.println("null");
			return null;
		} else {
			ServiceInstance instance = otherInstance.get(0);
			final String baseUrl = "http://" + instance.getHost() + ":" + instance.getPort() + "/skill/"+search;
			URI uri = new URI(baseUrl);

			ServiceInstance instance1 = otherInstance1.get(0);
			final String baseUrl1 = "http://" + instance1.getHost() + ":" + instance1.getPort() + "/skillSet/"+search;
			URI uri1 = new URI(baseUrl1);

			System.out.println(uri);

			ResponseEntity<List<SkillDtls>> response = restTemplate.exchange(uri, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<SkillDtls>>() {
					});

			ResponseEntity<List<MentorSkills>> response1 = restTemplate.exchange(uri1, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<MentorSkills>>() {
					});
			
			SearchResultList a = new SearchResultList();

			List<List> aList = new ArrayList<List>();
			aList.add(response.getBody());
			aList.add(response1.getBody());
			return aList;

			// return (List<SearchResultList>) response.getBody();

		}
	}*/
	
	public List<SearchResultList> getSerachResult(String search) throws URISyntaxException {
		System.out.println("1");
		List<ServiceInstance> otherInstance = discoveryClient.getInstances("caseStudy4-SkillDtls");
		List<ServiceInstance> otherInstance1 = discoveryClient.getInstances("caseStudy4-MentorSkill");
		System.out.println("instance found" + otherInstance);
		if (null == otherInstance || null == otherInstance1) {
			System.out.println("null");
			return null;
		} else {
			ServiceInstance instance = otherInstance.get(0);
			final String baseUrl = "http://" + instance.getHost() + ":" + instance.getPort() + "/skill/"+search;
			URI uri = new URI(baseUrl);

			ServiceInstance instance1 = otherInstance1.get(0);
			final String baseUrl1 = "http://" + instance1.getHost() + ":" + instance1.getPort() + "/skillSet/"+search;
			URI uri1 = new URI(baseUrl1);

			System.out.println(uri);

			ResponseEntity<List<SkillDtls>> response = restTemplate.exchange(uri, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<SkillDtls>>() {
					});

			ResponseEntity<List<MentorSkills>> response1 = restTemplate.exchange(uri1, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<MentorSkills>>() {
					});
			
			List<SkillDtls> skillDtlsList=response.getBody();
			List<MentorSkills> mentorSkillsList=response1.getBody();
			
			List<SearchResultList> searchResultList=new ArrayList<SearchResultList>();
			
			System.out.println("size of skillDtlsList"+skillDtlsList.size()+mentorSkillsList.size());
			for(int i=0;i<skillDtlsList.size();i++){
				System.out.println("inside in i loop");
				for(int j=0;j<mentorSkillsList.size();j++){
					System.out.println("inside in j loop");
					SearchResultList searchResult=new SearchResultList();
					System.out.println("inside in j loop 2");
					searchResult.setId(i+j+1);
					searchResult.setCourseId(skillDtlsList.get(i).getId());
					searchResult.setName(skillDtlsList.get(i).getName().substring(0, 1).toUpperCase() + skillDtlsList.get(i).getName().substring(1));
					searchResult.setToc(skillDtlsList.get(i).getToc());
					searchResult.setPrerequisites(skillDtlsList.get(i).getPrerequisites());
					searchResult.setMentorId(mentorSkillsList.get(j).getMentorId());
					searchResult.setMentorName(mentorSkillsList.get(j).getMentorName().substring(0, 1).toUpperCase()+mentorSkillsList.get(j).getMentorName().substring(1));
					searchResult.setSkills(mentorSkillsList.get(j).getSkills());
					searchResult.setYearsOfExperience(mentorSkillsList.get(j).getYearsOfExperience());
					searchResult.setTrainingsCompleted(mentorSkillsList.get(j).getTrainingsCompleted());
					searchResult.setAvgRating(mentorSkillsList.get(j).getAvgRating());
					searchResult.setRating(mentorSkillsList.get(j).getRating());
					searchResult.setDescription(mentorSkillsList.get(j).getDescription());
					searchResultList.add(searchResult);
				}
				System.out.println(searchResultList);
				
			}
			System.out.println(searchResultList);
			return searchResultList;

			// return (List<SearchResultList>) response.getBody();

		}
	}

}