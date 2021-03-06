/* This file is part of the iox project.
 * For more information, please see <http://www.eisenhutinformatik.ch/iox/>.
 *
 * Copyright (c) 2006 Eisenhut Informatik AG
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included 
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL 
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
 * DEALINGS IN THE SOFTWARE.
 */
package ch.interlis.iox;

/**
 * @author ce
 * @version $Revision: 1.0 $ $Date: 26.06.2006 $
 */
public class IoxException extends Exception {
	private int lineNumber=-1;
	public IoxException() {
		super();
	}

	public IoxException(String message) {
		super(message);
	}
	public IoxException(int lineNumber,String message) {
		super(message);
		this.lineNumber=lineNumber;
	}

	public IoxException(Throwable cause) {
		super(cause);
	}
	public IoxException(int lineNumber,Throwable cause) {
		super(cause);
		this.lineNumber=lineNumber;
	}

	public IoxException(String message, Throwable cause) {
		super(message, cause);
	}
	public IoxException(int lineNumber,String message, Throwable cause) {
		super(message, cause);
		this.lineNumber=lineNumber;
	}
	public String getLocalizedMessage() {
		if(lineNumber!=-1){
			return "line "+lineNumber+": "+super.getMessage();
		}
		return super.getLocalizedMessage();
	}
	public String getMessage() {
		if(lineNumber!=-1){
			return "line "+lineNumber+": "+super.getMessage();
		}
		return super.getMessage();
	}
	/** the line in the file that triggered this exception.
	 * @return line number or -1 if not associated with a line in a file
	 */
	public int getLineNumber(){
		return lineNumber;
	}

}
