package teste;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.categorii.ConstructorGrupaCategory;
import teste.categorii.GetPromovabilitateCategory;
import teste.categorii.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses({GrupaTestFixture.class,GrupaMockTest.class,GrupaTest.class})
//@Categories.IncludeCategory(GetPromovabilitateCategory.class)

@Categories.ExcludeCategory({GetPromovabilitateCategory.class,ConstructorGrupaCategory.class})
public class SuiteCustom {

}
