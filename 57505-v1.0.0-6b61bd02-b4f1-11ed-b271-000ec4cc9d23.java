/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE681_Incorrect_Conversion_between_Numeric_Types__double2float_10.java
Label Definition File: CWE681_Incorrect_Conversion_between_Numeric_Types.label.xml
Template File: point-flaw-10.tmpl.java
*/
/*
* @description
* CWE: 681 Incorrect Conversion between Numeric Types
* Sinks: double2float
*    GoodSink: check for conversion error
*    BadSink : explicit cast
* Flow Variant: 10 Control flow: if(IO.static_t) and if(IO.static_f)
*
* */

package testcases.CWE681_Incorrect_Conversion_between_Numeric_Types;

import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;

public class CWE681_Incorrect_Conversion_between_Numeric_Types__double2float_10 extends AbstractTestCase
{

    public void bad() throws Throwable
    {
        if (IO.static_t)
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;
            try
            {
                /* Enter: 1e-50, result should be 0.0 (for bad case)
                 *
                 * Note: alternate input
                 * 999999999999999999999999999999999999999999999999999999999999999
                 */
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter double number (1e-50): ");
                double num = 0;
                try
                {
                    num = Double.parseDouble(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }
                /* FLAW: should not cast without checking if conversion is safe */
                IO.writeLine("" + (float)num);
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;

            try
            {
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter double number (1e-50): ");
                double num = 0;
                try
                {
                    num = Double.parseDouble(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }

                /* FIX: check for conversion error */
                if (num > Float.MAX_VALUE ||
                        num < Float.MIN_VALUE)
                {
                    IO.writeLine("Error, cannot safely cast this number to a float!");
                    return;
                }

                IO.writeLine("" + (float)num);
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }

        }
    }

    /* good1() changes IO.static_t to IO.static_f */
    private void good1() throws Throwable
    {
        if(IO.static_f)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;
            try
            {
                /* Enter: 1e-50, result should be 0.0 (for bad case)
                 *
                 * Note: alternate input
                 * 999999999999999999999999999999999999999999999999999999999999999
                 */
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter double number (1e-50): ");
                double num = 0;
                try
                {
                    num = Double.parseDouble(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }
                /* FLAW: should not cast without checking if conversion is safe */
                IO.writeLine("" + (float)num);
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }
        }
        else {

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;

            try
            {
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter double number (1e-50): ");
                double num = 0;
                try
                {
                    num = Double.parseDouble(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }

                /* FIX: check for conversion error */
                if (num > Float.MAX_VALUE ||
                        num < Float.MIN_VALUE)
                {
                    IO.writeLine("Error, cannot safely cast this number to a float!");
                    return;
                }

                IO.writeLine("" + (float)num);
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if(IO.static_t)
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;
            try
            {
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter double number (1e-50): ");
                double num = 0;
                try
                {
                    num = Double.parseDouble(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }
                /* FIX: check for conversion error */
                if (num > Float.MAX_VALUE ||
                num < Float.MIN_VALUE)
                {
                    IO.writeLine("Error, cannot safely cast this number to a float!");
                    return;
                }
                IO.writeLine("" + (float)num);
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;
            try
            {
                /* Enter: 1e-50, result should be 0.0 (for bad case)
                 *
                 * Note: alternate input
                 * 999999999999999999999999999999999999999999999999999999999999999
                 */
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter double number (1e-50): ");
                double num = 0;
                try
                {
                    num = Double.parseDouble(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }

                /* FLAW: should not cast without checking if conversion is safe */
                IO.writeLine("" + (float)num);
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }

        }

    }

    public void good() throws Throwable
    {
        good1();
        good2();
    }

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
