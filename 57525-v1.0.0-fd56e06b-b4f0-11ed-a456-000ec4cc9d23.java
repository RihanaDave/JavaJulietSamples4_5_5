/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE681_Incorrect_Conversion_between_Numeric_Types__float2int_12.java
Label Definition File: CWE681_Incorrect_Conversion_between_Numeric_Types.label.xml
Template File: point-flaw-12.tmpl.java
*/
/*
* @description
* CWE: 681 Incorrect Conversion between Numeric Types
* Sinks: float2int
*    GoodSink: check value before conversion
*    BadSink : conversion may be unsafe
* Flow Variant: 12 Control flow: if(IO.static_returns_t_or_f())
*
* */

package testcases.CWE681_Incorrect_Conversion_between_Numeric_Types;

import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;

public class CWE681_Incorrect_Conversion_between_Numeric_Types__float2int_12 extends AbstractTestCase
{

    public void bad() throws Throwable
    {
        if (IO.static_returns_t_or_f())
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;
            try
            {
                /* Enter: 1e20f, result should be 2147483647 (for bad case) */
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter float number (1e20f): ");
                double num = 0;
                try
                {
                    num = Float.parseFloat(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }
                /* FLAW: should not cast without checking if conversion is safe */
                IO.writeLine("" + (int)num);
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
                System.out.print("Enter float number (1e20f): ");
                double num = 0;
                try
                {
                    num = Float.parseFloat(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }

                /* FIX: check to make sure conversion is safe */
                if (num > Integer.MAX_VALUE ||
                        num < Integer.MIN_VALUE)
                {
                    IO.writeLine("Value is too small or large to be represented as an int");
                }
                else {

                    IO.writeLine("" + (int)num);
                }
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

    /* good1() changes the "if" so that both branches use the GoodSink */
    private void good1() throws Throwable
    {
        if(IO.static_returns_t_or_f())
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;
            try
            {
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter float number (1e20f): ");
                double num = 0;
                try
                {
                    num = Float.parseFloat(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }
                /* FIX: check to make sure conversion is safe */
                if (num > Integer.MAX_VALUE ||
                num < Integer.MIN_VALUE)
                {
                    IO.writeLine("Value is too small or large to be represented as an int");
                }
                else
                {
                    IO.writeLine("" + (int)num);
                }
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
                System.out.print("Enter float number (1e20f): ");
                double num = 0;
                try
                {
                    num = Float.parseFloat(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }

                /* FIX: check to make sure conversion is safe */
                if (num > Integer.MAX_VALUE ||
                        num < Integer.MIN_VALUE)
                {
                    IO.writeLine("Value is too small or large to be represented as an int");
                }
                else {

                    IO.writeLine("" + (int)num);
                }
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
