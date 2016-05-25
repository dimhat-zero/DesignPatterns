package org.dimhat.demo8;

/**
 * 组合模式
 * <p>
 * 部分整体层次结构
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月25日 上午10:43:38
 */
public class Main {

	public static void main(String[] args) {
		Company root = new ConcreteCompany("总公司");
		Company leaf1 = new ConcreteCompany("上海分公司");
		leaf1.add(new FinanceDepartment("上海财务部门"));
		leaf1.add(new HRDepartment("上海hr部门"));
		root.add(leaf1);
		Company leaf2 = new ConcreteCompany("杭州分公司");
		leaf2.add(new FinanceDepartment("杭州财务部门"));
		leaf2.add(new HRDepartment("杭州hr部门"));
		root.add(leaf2);
		root.display(0);
	}

}
