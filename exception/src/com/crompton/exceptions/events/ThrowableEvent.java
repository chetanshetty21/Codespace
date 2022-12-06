package com.crompton.exceptions.events;

import java.awt.AWTException;
import java.awt.color.CMMException;

import java.nio.file.FileSystemAlreadyExistsException;
import java.rmi.activation.ActivationException;
import java.security.acl.AclNotFoundException;
import java.time.DateTimeException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.concurrent.CompletionException;
import java.util.prefs.BackingStoreException;

import javax.management.JMRuntimeException;
import javax.swing.undo.*;

import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;

import com.sun.xml.internal.ws.spi.db.DatabindingException;
import java.awt.AWTError;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.print.PrinterException;
import java.io.IOError;
import java.lang.annotation.AnnotationFormatError;
import java.lang.instrument.UnmodifiableClassException;

import java.net.URISyntaxException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;

import java.rmi.server.ServerNotActiveException;

import java.sql.SQLException;

import java.util.TooManyListenersException;

import javax.management.BadAttributeValueExpException;

import javax.print.PrintException;
import javax.script.ScriptException;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.text.BadLocationException;
import javax.swing.undo.CannotRedoException;
import javax.transaction.xa.XAException;

import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.soap.SOAPException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.validation.SchemaFactoryConfigurationError;

import org.omg.CORBA.portable.RemarshalException;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import com.sun.org.apache.xerces.internal.impl.xpath.XPathException;
import com.sun.org.apache.xerces.internal.xni.parser.XMLParseException;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureException;

import com.sun.xml.internal.ws.policy.privateutil.ServiceConfigurationError;

import jdk.internal.org.xml.sax.SAXException;

public class ThrowableEvent {

	private static final String String = null;

	public void RuntimeException01() {
		System.out.println("running RuntimeException");
		throw new RuntimeException();
	}

	public void ArithmeticException02() {
		System.out.println("running ArithmeticException");
		throw new ArithmeticException();
	}

	public void ArrayStoreException03() {
		System.out.println("running ArrayStoreException");
		throw new ArrayStoreException();

	}

	public void BufferOverflowException04() {
		System.out.println("running BufferOverflowException");
		throw new BufferOverflowException();
	}

	public void BufferUnderflowException05() {
		System.out.println("running BufferUnderflowException()");
		throw new BufferUnderflowException();

	}

	public void CannotRedoException06() {
		System.out.println("running CannotRedoException");
		throw new CannotRedoException();
	}

	public void CannotUndoException07() {
		System.out.println("running CannotUndoException");
		throw new CannotUndoException();

	}

	public void ClassCastException08() {
		System.out.println("ClassCastException");

		throw new ClassCastException();

	}

	public void CMMException09() {
		System.out.println("CMMException");

		throw new CMMException(null);

	}

	public void CompletionException10() {
		System.out.println("CompletionException");

		throw new CompletionException(null);

	}

	public void ConcurrentModificationException11() {
		System.out.println(" ConcurrentModificationException");

		throw new ConcurrentModificationException();

	}

	public void DataBindingException12() {
		System.out.println(" DataBindingException");

		throw new DatabindingException();

	}

	public void DateTimeException13() {
		System.out.println(" DateTimeException");

		throw new DateTimeException(null);

	}

	public void DOMException14() {
		System.out.println("  DOMException");

		throw new DOMException((short) 0, null);

	}

	public void DataBindingException15() {
		System.out.println(" EmptyStackException");

		throw new EmptyStackException();

	}

	public void EnumConstantNotPresentException16() {
		System.out.println(" EnumConstantNotPresentException");

		throw new EnumConstantNotPresentException(null, null);
	}

	public void EventException16() {
		System.out.println(" EventException");

		throw new EventException((short) 0, null);

	}

	public void FileSystemAlreadyExistsException17() {
		System.out.println(" FileSystemAlreadyExistsExceptionn");

		throw new FileSystemAlreadyExistsException();

	}

	public void EventException18() {
		System.out.println(" EventException");

		throw new EventException((short) 0, null);

	}

	public void EnumConstantNotPresentException19() {
		System.out.println(" EnumConstantNotPresentException");

		throw new EnumConstantNotPresentException(null, null);
	}

	public void DataBindingException19() {
		System.out.println(" EmptyStackException");

		throw new EmptyStackException();

	}

	public void DOMException20() {
		System.out.println("  DOMException");

		throw new DOMException((short) 0, null);

	}

	public void DateTimeException21() {
		System.out.println(" DateTimeException");

		throw new DateTimeException(null);

	}

	public void DataBindingException22() {
		System.out.println(" DataBindingException");

		throw new DatabindingException();

	}

	public void RuntimeException23() {
		System.out.println("running RuntimeException");
		throw new RuntimeException();
	}

	public void RuntimeException24() {
		System.out.println("running RuntimeException");
		throw new RuntimeException();
	}

	public void ArithmeticException25() {
		System.out.println("running ArithmeticException");
		throw new ArithmeticException();
	}

	public void ArrayStoreException26() {
		System.out.println("running ArrayStoreException");
		throw new ArrayStoreException();

	}

	public void BufferOverflowException27() {
		System.out.println("running BufferOverflowException");
		throw new BufferOverflowException();
	}

	public void BufferUnderflowException28() {
		System.out.println("running BufferUnderflowException()");
		throw new BufferUnderflowException();

	}

	public void CannotRedoException29() {
		System.out.println("running CannotRedoException");
		throw new CannotRedoException();
	}

	public void CannotUndoException30() {
		System.out.println("running CannotUndoException");
		throw new CannotUndoException();

	}

	public void ClassCastException31() {
		System.out.println("ClassCastException");

		throw new ClassCastException();

	}

	public void CMMException32() {
		System.out.println("CMMException");

		throw new CMMException(null);

	}

	public void CompletionException33() {
		System.out.println("CompletionException");

		throw new CompletionException(null);

	}

	public void ConcurrentModificationException34() {
		System.out.println(" ConcurrentModificationException");

		throw new ConcurrentModificationException();

	}

	public void JMRuntimeException35() {
		System.out.println("JMRuntimeException");
		throw new JMRuntimeException();
	}

	public void AclNotFoundException1() throws AclNotFoundException {

		System.out.println("running AclNotFoundException");
		throw new AclNotFoundException();
	}

	public void ActivationException2() throws ActivationException {
		System.out.println("running ActivationException");
		throw new ActivationException();
	}

	public void AlreadyBoundException() {
		System.out.println("running exceptionMethod3");
		throw new AlreadyBoundException();
	}

	public void AWTException4() throws AWTException {
		System.out.println("running AWTException");

		throw new AWTException(null);
	}

	public void AlreadyBoundException5() {
		System.out.println("running AlreadyBoundException");
		throw new AlreadyBoundException();
	}

	public void BackingStoreException6() throws BackingStoreException {
		System.out.println("running BackingStoreException");
		throw new BackingStoreException(String);
	}

	public void BadAttributeValueExpException(Object Object) throws BadAttributeValueExpException {
		System.out.println("running BadAttributeValueExpException");
		throw new BadAttributeValueExpException(Object);
	}

	public void exceptionMethod8(int offs) throws BadLocationException {
		System.out.println("running exceptionMethod8");
		throw new BadLocationException(String, offs);
	}

	public void exceptionMethod9(int offs) throws BadLocationException {
		System.out.println("running exceptionMethod9");
		throw new BadLocationException(String, offs);
	}

	public void exceptionMethod10() throws XPathException {
		System.out.println("running exceptionMethod10");
		throw new XPathException(String);
	}

	public void exceptionMethod11() throws XMLStreamException {
		System.out.println("running exceptionMethod11");
		throw new XMLStreamException();
	}

	public void exceptionMethod12() throws XMLSignatureException {
		System.out.println("running exceptionMethod12");
		throw new XMLSignatureException();
	}

	public void exceptionMethod13() {
		System.out.println("running exceptionMethod13");
		throw new XMLParseException(null, null);
	}

	public void exceptionMethod14() throws XAException {
		System.out.println("running exceptionMethod14");
		throw new XAException();
	}

	public void exceptionMethod15() throws URISyntaxException {
		System.out.println("running exceptionMethod15");
		throw new URISyntaxException(String, String);
	}

	public void exceptionMethod16() throws AclNotFoundException {
		System.out.println("running exceptionMethod16");
		throw new AclNotFoundException();
	}

	public void exceptionMethod17() throws URIReferenceException {
		System.out.println("running exceptionMethod17");
		throw new URIReferenceException();
	}

	public void exceptionMethod18(DataFlavor DataFlavor) throws UnsupportedFlavorException {
		System.out.println("running exceptionMethod18");
		throw new UnsupportedFlavorException(DataFlavor);
	}

	public void exceptionMethod19(Callback Callback) throws UnsupportedCallbackException {
		System.out.println("running exceptionMethod19");
		throw new UnsupportedCallbackException(Callback);
	}

	public void exceptionMethod20() throws UnsupportedAudioFileException {
		System.out.println("running exceptionMethod20");
		throw new UnsupportedAudioFileException();
	}

	public void exceptionMethod21() throws UnmodifiableClassException {
		System.out.println("running exceptionMethod21");
		throw new UnmodifiableClassException();
	}

	public void exceptionMethod22() throws TransformException {
		System.out.println("running exceptionMethod22");
		throw new TransformException();
	}

	public void exceptionMethod23() throws TransformerException {
		System.out.println("running exceptionMethod23");
		throw new TransformerException(String);
	}

	public void exceptionMethod24() throws TooManyListenersException {
		System.out.println("running exceptionMethod24");
		throw new TooManyListenersException();
	}

	public void exceptionMethod25() throws TimeoutException {
		System.out.println("running exceptionMethod25");
		throw new TimeoutException();
	}

	public void exceptionMethod26() throws SQLException {
		System.out.println("running exceptionMethod26");
		throw new SQLException();
	}

	public void exceptionMethod27() throws SOAPException {
		System.out.println("running exceptionMethod27");
		throw new SOAPException();
	}

	public void exceptionMethod28() throws ServerNotActiveException {
		System.out.println("running exceptionMethod28");
		throw new ServerNotActiveException();
	}

	public void exceptionMethod29(Object Exception) throws ScriptException {
		System.out.println("running exceptionMethod29");
		throw new ScriptException((java.lang.String) Exception);
	}

	public void exceptionMethod30() throws SAXException {
		System.out.println("running exceptionMethod30");
		throw new SAXException();
	}

	public void exceptionMethod31() throws RemarshalException {
		System.out.println("running exceptionMethod31");
		throw new RemarshalException();
	}

	public void exceptionMethod32() throws RefreshFailedException {
		System.out.println("running exceptionMethod32");
		throw new RefreshFailedException();
	}

	public void exceptionMethod33() throws ReflectiveOperationException {
		System.out.println("running exceptionMethod33");
		throw new ReflectiveOperationException();
	}

	public void exceptionMethod34() throws PrintException {
		System.out.println("running exceptionMethod34");
		throw new PrintException();
	}

	public void exceptionMethod35() throws PrinterException {
		System.out.println("running exceptionMethod35");
		throw new PrinterException();
	}

	public void errorMethod1() {
		System.out.println("running the errorMethod1");
		throw new AnnotationFormatError(String);
	}

	public void errorMethod2() {
		System.out.println("running the errorMethod2");
		throw new AssertionError();
	}

	public void errorMethod3() {
		System.out.println("running the errorMethod3");
		throw new AWTError(String);
	}

	public void errorMethod4(Exception Exception) {
		System.out.println("running the errorMethod4");
		throw new CoderMalfunctionError(Exception);
	}

	public void errorMethod5() {
		System.out.println("running the errorMethod5");
		throw new FactoryConfigurationError();
	}

	public void errorMethod6(Throwable Throwable) {
		System.out.println("running the errorMethod6");
		throw new IOError(Throwable);
	}

	public void errorMethod7() {
		System.out.println("running the errorMethod7");
		throw new LinkageError();
	}

	public void errorMethod8() {
		System.out.println("running the errorMethod8");
		throw new SchemaFactoryConfigurationError();
	}

	public void errorMethod9() {
		System.out.println("running the errorMethod9");
		throw new ServiceConfigurationError(String);
	}

	public void errorMethod10() {
		System.out.println("running the errorMethod10");
		throw new ThreadDeath();
	}

	public void errorMethod11() {
		System.out.println("running the errorMethod11");
		throw new TransformerFactoryConfigurationError();
	}

	public void errorMethod12() {
		System.out.println("running the errorMethod11");
		throw new LinkageError();
	}

}
