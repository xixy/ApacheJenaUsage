package cn.xixy.ApacheJeanUsage;

import java.io.InputStream;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;

public class ReadRDF {
	
	public static String inputFileName = "src/test.xml";

	public static void main(String[] args) {
		 // create an empty model
		 Model model = ModelFactory.createDefaultModel();

		 // use the FileManager to find the input file
		 InputStream in = FileManager.get().open( inputFileName );
		if (in == null) {
		    throw new IllegalArgumentException(
		                                 "File: " + inputFileName + " not found");
		}

		// read the RDF/XML file
		model.read(in, null);

		// write it to standard out
		model.write(System.out);

	}

}
