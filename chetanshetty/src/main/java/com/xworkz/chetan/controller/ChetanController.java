package com.xworkz.chetan.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.chetan.dto.BeverageDTO;
import com.xworkz.chetan.dto.ChatDTO;
import com.xworkz.chetan.dto.EducationDTO;
import com.xworkz.chetan.dto.FamilyDTO;
import com.xworkz.chetan.dto.MobileDTO;

@Component
@RequestMapping("/")
public class ChetanController {

	@GetMapping("/bottle")
	public String onBottle(Model model) {
		System.out.println("running bottle");
		model.addAttribute("emailId", "chetansv21@gmail.com");
		return "index.jsp";

	}

	@GetMapping("/water")
	public String onWater(Model model) {
		System.out.println("running water");
		model.addAttribute("MobileNo", 7892225217d);
		return "index.jsp";

	}

	@GetMapping("/doc")
	public String onDoc(Model model) {
		System.out.println("running doc");
		model.addAttribute("Aadhar", 789651242d);
		return "index.jsp";

	}

	@GetMapping("/yhasu")
	public String onAge(Model model) {
		System.out.println("running Yhasu");
		model.addAttribute("Age", 23);
		return "index.jsp";

	}

	@GetMapping("/varsha")
	public String onDOB(Model model) {
		System.out.println("running DOB with time");
		model.addAttribute("DOB", LocalDateTime.of(1999, 02, 21, 6, 20));
		return "index.jsp";

	}

	@GetMapping("/sambla")
	public String onSalary(Model model) {
		System.out.println("running salary");
		model.addAttribute("salary", 5.5d);
		return "index.jsp";

	}

	@GetMapping("/friend")
	public String onFriend(Model model) {
		System.out.println("running friend");
		List<String> ref = new ArrayList<String>();
		ref.add("srini");
		ref.add("vikas");
		ref.add("darshan");
		ref.add("raju");
		ref.add("mani");

		model.addAttribute("friends", ref);
		return "index.jsp";
	}

	@GetMapping("/place")
	public String onPlace(Model model) {
		System.out.println("running place");
		List<String> ref1 = new ArrayList<String>();
		ref1.add("mysore");
		ref1.add("gokarna");
		ref1.add("mumbai");
		ref1.add("pune");
		ref1.add("kumta");

		model.addAttribute("places", ref1);
		return "index.jsp";
	}

	@GetMapping("/skill")
	public String onSkill(Model model) {
		System.out.println("running skill");
		List<String> ref2 = new ArrayList<String>();
		ref2.add("java");
		ref2.add("sql");
		ref2.add("html");
		ref2.add("css");
		ref2.add("solidworks");

		model.addAttribute("skills", ref2);
		return "index.jsp";
	}

	@GetMapping("/education")
	public String onEducation(Model model) {
		System.out.println("running education");
		EducationDTO dto1 = new EducationDTO();
		dto1.setName("chetan");
		dto1.setSchoolName("scvk");
		dto1.setCollageName("sri chaithayna");
		dto1.setDegreeCollageName("skit");
		dto1.setTenthMarks(72);
		dto1.setPuMarks(53);
		dto1.setBEMarks(65);
		dto1.setSchoolPassedOut(LocalDateTime.of(20, 05, 0, 0, 0, 0));
		dto1.setCollagePassedOut(LocalDateTime.of(27, 05, 0, 0, 0));
		dto1.setDegreePassedOut(LocalDateTime.of(21, 05, 0, 0, 0));
		model.addAttribute("data", dto1);
		return "index.jsp";
	}

	@GetMapping("/beverage")
	public String onBeverage(Model model) {
		System.out.println("running Beverage");
		BeverageDTO dto2 = new BeverageDTO();
		dto2.setBeverageName("applejuice");
		dto2.setBeveragePrice(500);
		dto2.setNoOfbeverage(50);
		dto2.setOwnerName("chetan");
		dto2.setBeverageId(123);
		dto2.setBeverageShopName("dove shop");
		dto2.setBeverageShopPH(789222527);
		dto2.setBeverageShopLocation("bangalore");
		model.addAttribute("juice", dto2);
		return "index.jsp";

	}

	@GetMapping("/kutuma")
	public String onFamily(Model model) {
		System.out.println("running family");
		FamilyDTO dto3 = new FamilyDTO();
		dto3.setFamilyName("shetty");
		dto3.setNoOfperson(500);
		dto3.setFamilyType("joint");
		dto3.setFamilyHeadName("chetan");
		dto3.setFamilyHomeName("chetan");
		dto3.setFamilyBusinessName("venky shop");
		dto3.setFamilyDoctorName("chetan");
		dto3.setFamilyHomeLocated("bangalore");
		dto3.setFamilyNoOfCar(50);
		dto3.setFamilyNoOfBike(50);

		model.addAttribute("bandha", dto3);
		return "index.jsp";
	}

	@GetMapping("/phone")
	public String onMobile(Model model) {
		System.out.println("running family");
		MobileDTO dto4 = new MobileDTO();
		dto4.setMobileName("a 52");
		dto4.setMobilePrice(5000);
		dto4.setNoOfMobile(500);
		dto4.setOwnerName("chetan");
		dto4.setMobileId(451);
		dto4.setMobileShopName("venky shop");
		dto4.setMobileShopPH(7892225217d);
		dto4.setNoOfEmployee(500);
		dto4.setMobileGSTNo("saCzxvcz5xv43zxv");
		dto4.setMobileShopLocation("bangalore");

		model.addAttribute("mobile", dto4);
		return "index.jsp";
	}

	@GetMapping("/masala")
	public String onChat(Model model) {
		System.out.println("running Chat");
		ChatDTO dto5 = new ChatDTO();
		dto5.setChatName("pani puri");
		dto5.setChatPrice(5000);
		dto5.setNoOfPlates(500);
		dto5.setOwnerName("chetan");
		dto5.setId(451);
		dto5.setChatShopName("venky shop");
		dto5.setChatShopPH(7892225217d);
		dto5.setNoOfEmployee(500);
		dto5.setChatGSTNo("saCzxvcz5xv43zxv");
		dto5.setChatShopLocation("bangalore");

		model.addAttribute("spicy", dto5);
		return "index.jsp";
	}

}
