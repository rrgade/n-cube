package com.cedarsoftware.ncube;

import java.util.Map;

/**
 * Process a String that is specified at a URL.
 *
 * @author John DeRegnaucourt (jdereg@gmail.com)
 *         <br/>
 *         Copyright (c) Cedar Software LLC
 *         <br/><br/>
 *         Licensed under the Apache License, Version 2.0 (the "License");
 *         you may not use this file except in compliance with the License.
 *         You may obtain a copy of the License at
 *         <br/><br/>
 *         http://www.apache.org/licenses/LICENSE-2.0
 *         <br/><br/>
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *         See the License for the specific language governing permissions and
 *         limitations under the License.
 */
public class StringUrlCmd extends UrlCommandCell
{
    public StringUrlCmd(String url)
    {
        super(null, url, false);
    }

    public StringUrlCmd(String url, boolean cache)
    {
        super(null, url, cache);
    }

    @Override
    protected Object proxyFetch(Map args)
    {
        byte[] bytes = (byte[])super.proxyFetch(args);
        return bytes == null ? null : new String(bytes);
    }

    protected Object executeInternal(Object data, Map ctx)
    {
        return data;
    }
}
