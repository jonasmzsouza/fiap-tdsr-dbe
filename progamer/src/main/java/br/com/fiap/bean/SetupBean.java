package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;

@ManagedBean
public class SetupBean {

	private Setup setup = new Setup();

	public void save() {
		new SetupDao().save(this.setup);
		System.out.println("Saving..." + this.setup);
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}

}
