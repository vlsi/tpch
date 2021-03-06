/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.airlift.tpch;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.util.Locale.ENGLISH;

public class Region
        implements TpchEntity
{
    private final long regionKey;
    private final String name;
    private final String comment;

    public Region(long regionKey, String name, String comment)
    {
        this.regionKey = regionKey;
        this.name = checkNotNull(name, "name is null");
        this.comment = checkNotNull(comment, "comment is null");
    }

    public long getRegionKey()
    {
        return regionKey;
    }

    public String getName()
    {
        return name;
    }

    public String getComment()
    {
        return comment;
    }

    public String toLine()
    {
        return String.format(ENGLISH, "%d|%s|%s|", regionKey, name, comment);
    }
}
